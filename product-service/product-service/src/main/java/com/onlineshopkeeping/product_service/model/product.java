package com.onlineshopkeeping.product_service.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.lang.annotation.Documented;
import java.math.BigDecimal;

//to define this product as a mongo db document
@Document(value = "product")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class product {
    @Id
    private String id;
    private String name;
    private String description;
    private BigDecimal price;
}
