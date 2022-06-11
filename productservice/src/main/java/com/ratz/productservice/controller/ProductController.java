package com.ratz.productservice.controller;

import com.ratz.productservice.model.Product;
import com.ratz.productservice.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/product")
public class ProductController {

  @Autowired
  private ProductRepository productRepository;

  @PostMapping
  public Product createProduct(@RequestBody Product product){

    return productRepository.save(product);
  }

}
