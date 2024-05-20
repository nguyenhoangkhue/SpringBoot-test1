package com.example.springboottest1.model;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Product {
    Integer id;
    String name;
    String description;
    String thumbnail;
    Integer price;
    Double rating;
    Integer priceDiscount;
}
