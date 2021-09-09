package com.project.controllers;

import com.project.model.Product;
import com.project.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/")
    public List<Product> getProduct(){
        return productService.getAllProduct();
    }

    @PostMapping("/")
    public Product saveProduct(@RequestBody Product product){
        return productService.saveProduct(product);
    }

    @GetMapping("{id}")
    public Optional<Product> getProductById(@PathVariable("id") int pid){
        return productService.getProductById(pid);
    }
}
