package com.example.springboottest1.dao;

import com.example.springboottest1.model.Product;

import java.util.List;

public interface ProductDAO {
    List<Product> findAll();
    Product findByID(int id);
}
