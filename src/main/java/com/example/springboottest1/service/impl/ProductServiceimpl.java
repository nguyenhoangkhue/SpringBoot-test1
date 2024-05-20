package com.example.springboottest1.service.impl;

import com.example.springboottest1.dao.ProductDAO;
import com.example.springboottest1.model.Product;
import com.example.springboottest1.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceimpl implements ProductService {
    @Autowired
    private ProductDAO productDAO;
    @Override
    public List<Product> getAllProducts(){
        return productDAO.findAll();
    }
    @Override
    public Product getProductById(int id){
        return productDAO.findByID(id);
    }
}
