package com.example.springboottest1.controller;

import com.example.springboottest1.model.Product;
import com.example.springboottest1.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
@RequestMapping
@Controller
public class ProductController {
    @Autowired
    private ProductService productService;
    @GetMapping("")
    public String getAllProducts(Model model) {
        List<Product> products = productService.getAllProducts();
        model.addAttribute("products",products);
        return "AllProducts";
    }
    @GetMapping("products/{id}")
    public String getProductById(Model model, @PathVariable int id){
        Product product=productService.getProductById(id);
        model.addAttribute("product",product);
        return "ProductById";
    }
}
