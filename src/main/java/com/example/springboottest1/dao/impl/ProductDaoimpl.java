package com.example.springboottest1.dao.impl;

import com.example.springboottest1.dao.ProductDAO;
import com.example.springboottest1.database.ProductDB;
import com.example.springboottest1.model.Product;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class ProductDaoimpl implements ProductDAO {
    @Override
    public List<Product> findAll(){
        return ProductDB.products;
    }
    @Override
    public Product findByID(int id){
        return findAll().stream()
                .filter(product -> product.getId()==(id))
                .findFirst()
                .orElse(null);
    }
}
