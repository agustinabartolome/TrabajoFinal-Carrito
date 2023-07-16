package com.example.carritocompras.repositories;

import com.example.carritocompras.entity.pedido;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface pedidoRepository extends JpaRepository <pedido, String> {
    List<pedido> findByProductoId(String productoId);
}
