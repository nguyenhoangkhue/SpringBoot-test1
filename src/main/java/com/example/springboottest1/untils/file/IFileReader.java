package com.example.springboottest1.untils.file;

import com.example.springboottest1.model.Product;

import java.util.List;

public interface IFileReader {
    List<Product> readFile(String filePath);
}
