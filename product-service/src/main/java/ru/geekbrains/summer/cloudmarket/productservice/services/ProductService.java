package ru.geekbrains.summer.cloudmarket.productservice.services;

import ru.geekbrains.summer.cloudmarket.productservice.entities.Product;

import java.util.List;

public interface ProductService {

    List<Product> findAllProducts();

    void remove(Long id);

    Product createOrUpdate(Product product);

}
