package com.example.springboottest1.untils.file;

import com.example.springboottest1.model.Product;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;
import java.util.List;

@Component
public class JsonFileReader implements IFileReader {
    @Override
    public List<Product> readFile(String filePath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            List<Product> products = mapper.readValue(new File(filePath), new TypeReference<List<Product>>() {});
            return products;
        } catch (IOException e) {
            e.printStackTrace();
            return List.of();
        }
    }
}