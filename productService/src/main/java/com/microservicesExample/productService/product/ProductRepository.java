package com.microservicesExample.productService.product;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservicesExample.productService.product.model.ProductEntity;

public interface ProductRepository extends JpaRepository<ProductEntity, String> {

}
