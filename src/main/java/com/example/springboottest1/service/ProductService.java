package com.example.springboottest1.service;

import com.example.springboottest1.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAllProducts();
    Product getProductById(int id);
}
