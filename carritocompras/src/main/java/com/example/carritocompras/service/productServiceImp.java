package com.example.carritocompras.service;

import com.example.carritocompras.entity.product;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class productServiceImp implements productService {

    private final productRepository productRepository;

    public productServiceImp(productRepository productRepository) {
        this.productRepository = productRepository;
    }

    private class productRepository {
        public product save(product product) {
            return product;
        }

        public Optional<product> findById(Integer id) {
            return null;
        }
    }

    @Override
    public product save(product product) {
        return productRepository.save(product);
    }

    @Override
    public Optional<product> get(Integer id) {
        return productRepository.findById(id);
    }

    @Override
    public void update(product product) {
        productRepository.save(product);

    }

}

