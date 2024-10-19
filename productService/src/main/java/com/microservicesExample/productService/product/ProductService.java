package com.microservicesExample.productService.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservicesExample.productService.product.model.ProductEntity;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<ProductEntity> getAllProducts() {
        return productRepository.findAll();
    }

    public ProductEntity getProductById(String id) {
        return productRepository.findById(id).orElse(null);
    }

    public ProductEntity addProduct(ProductEntity productEntity) {
        return productRepository.save(productEntity);
    }
}
