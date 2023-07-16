package com.example.carritocompras.repositories;


import com.example.carritocompras.entity.product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface productRepository extends JpaRepository<product,Integer> {
   List<product>finByCategoriaAndIdNot(String categoria, String productId);
    List<product>first5ByOrderByPriceAsc();
}
