package com.example.demo.repository;

import com.example.demo.model.Product;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends SearchRepository<Product, Integer> {
}
