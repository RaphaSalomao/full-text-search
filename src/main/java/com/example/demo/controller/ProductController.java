package com.example.demo.controller;

import com.example.demo.model.Product;
import com.example.demo.service.ProductService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController()
@RequestMapping("/products")
@AllArgsConstructor
public class ProductController {

    private final ProductService productService;

    @GetMapping
    public ResponseEntity<List<Product>> findAll() {
        return ResponseEntity.ok().body(productService.findAll());
    }

    @GetMapping("/search")
    public ResponseEntity<List<Product>> findAllByText(
            @RequestParam(defaultValue = "") String text,
            @RequestParam(defaultValue = "name,description") List<String> fields,
            @RequestParam(defaultValue = "10") int limit
    ) {
        log.info("Searching for '{}' in fields '{}' limit '{}'", text, fields, limit);
        return ResponseEntity.ok().body(productService.findAllByText(text, fields, 10));
    }

}
