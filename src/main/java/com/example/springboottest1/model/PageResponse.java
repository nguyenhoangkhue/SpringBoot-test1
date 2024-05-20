package com.example.springboottest1.model;

import java.util.List;

public interface PageResponse <T>{
    List<T> getContent();
    int getPageSize();
    int getTotalPage();
    int getTotalElement();
    int getCurrentPage();
}

