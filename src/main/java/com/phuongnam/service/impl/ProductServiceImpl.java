package com.phuongnam.service.impl;

import com.phuongnam.model.Product;
import com.phuongnam.repository.ProductRepository;
import com.phuongnam.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;


    @Override
    public Iterable<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public Page<Product> findAllByModelContaining(String model, Pageable pageable) {
        return productRepository.findAllByModelContaining(model, pageable);
    }

    @Override
    public Optional<Product> findById(Long id) {
        return productRepository.findById(id);
    }

    @Override
    public void save(Product product) {
         productRepository.save(product);
    }


    @Override
    public void remove(Long id) {
        productRepository.deleteById(id);
    }
}
