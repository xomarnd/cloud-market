package ru.geekbrains.summer.cloudmarket.productservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.geekbrains.summer.cloudmarket.productservice.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
