package com.example.carritocompras.service;

import com.example.carritocompras.entity.product;

import java.util.Optional;

public interface productService {
    public product save(product product);
    public Optional<product> get(Integer id);
    public void update(product product);
}
