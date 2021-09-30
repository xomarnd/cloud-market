package ru.geekbrains.summer.cloudmarket.productservice.services.impl;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;
import ru.geekbrains.summer.cloudmarket.productservice.entities.Product;
import ru.geekbrains.summer.cloudmarket.productservice.repositories.ProductRepository;
import ru.geekbrains.summer.cloudmarket.productservice.services.ProductService;

import java.util.List;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ProductServiceImpl implements ProductService {

    final ProductRepository productRepository;

    @Override
    public List<Product> findAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public void remove(Long id) {
        productRepository.deleteById(id);
    }

    @Override
    public Product createOrUpdate(Product product) {
        return productRepository.save(product);
    }

}
