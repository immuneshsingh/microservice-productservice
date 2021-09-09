package com.project.services;

import com.project.model.Product;
import com.project.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;

    public List<Product> getAllProduct(){
        return productRepository.findAll();
    }

    public Optional<Product> getProductById(int pid){
        return productRepository.findById(pid);
    }

    public Product saveProduct(Product product){
        return productRepository.save(product);
    }
}
