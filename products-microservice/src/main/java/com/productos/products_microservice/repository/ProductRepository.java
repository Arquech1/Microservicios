package com.productos.products_microservice.repository;

import com.productos.products_microservice.entity.ProductsEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<ProductsEntity, String> {
}
