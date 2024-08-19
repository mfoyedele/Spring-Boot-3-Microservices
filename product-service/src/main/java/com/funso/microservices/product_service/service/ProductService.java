package com.funso.microservices.product_service.service;

import com.funso.microservices.product_service.dto.ProductRequest;
import com.funso.microservices.product_service.model.Product;
import com.funso.microservices.product_service.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;

    public void createProduct(ProductRequest productRequest) {
      Product product = Product.builder()
              .name(productRequest.name())
              .description(productRequest.description())
              .price(productRequest.price())
              .build();
      productRepository.save(product);
    }
}
