package com.onlineshopkeeping.product_service.repository;

import com.onlineshopkeeping.product_service.model.product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<product, String> {
}
