package ru.netology.task_3_dao.controller;


import ru.netology.task_3_dao.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @Autowired
    private ProductRepository repository;

    @GetMapping("/products/fetch-product")
    public String fetchProduct(@RequestParam("name") String name) {
        return repository.getProductName(name);
    }
}