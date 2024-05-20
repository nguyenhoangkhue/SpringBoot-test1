package com.example.springboottest1.model;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PageResponseimpl <T> implements PageResponse{
    List<T> data;
    int currentPage;
    int pageSize;
    @Override
    public List getContent() {
        int startIndex=(currentPage-1)*pageSize;
        if(startIndex<data.size()){
            int endIndex=Math.min(startIndex+pageSize,data.size());
            return data.subList(startIndex,endIndex);
        }
        return List.of();
    }

    @Override
    public int getPageSize() {
        return pageSize;
    }

    @Override
    public int getTotalPage() {
        return (int) Math.ceil((double) data.size()/pageSize);
    }

    @Override
    public int getTotalElement() {
        return data.size();
    }

    @Override
    public int getCurrentPage() {
        return currentPage;
    }
}
