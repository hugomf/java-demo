package com.amazon.javademo.product;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    private ProductRepository repo;

    public ProductController(ProductRepository repo) {
        this.repo = repo;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Product> fetchProducts() {
        List<Product> products = this.repo.findAll();
        return products;
    }
}
