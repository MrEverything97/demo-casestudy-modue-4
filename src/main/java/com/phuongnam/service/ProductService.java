package com.phuongnam.service;

import com.phuongnam.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface ProductService {
    Page<Product> findAll(Pageable pageable);

    Page<Product> findAllByModelContaining(String model, Pageable pageable);

    Optional<Product> findById(Long id);

    void save(Product product);

    void remove(Long id);
}
