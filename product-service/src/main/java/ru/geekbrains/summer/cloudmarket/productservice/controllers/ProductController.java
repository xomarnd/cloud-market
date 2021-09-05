package ru.geekbrains.summer.cloudmarket.productservice.controllers;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.core.convert.ConversionService;
import org.springframework.web.bind.annotation.*;
import ru.geekbrains.summer.cloudmarket.dto.ProductDto;
import ru.geekbrains.summer.cloudmarket.productservice.entities.Product;
import ru.geekbrains.summer.cloudmarket.productservice.services.ProductService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ProductController {

    final ProductService productService;
    final ConversionService conversionService;

    @GetMapping
    List<ProductDto> getProducts() {
        return productService.findAllProducts().stream()
                .map(product -> conversionService.convert(product, ProductDto.class))
                .collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable Long id) {
        productService.remove(id);
    }

    @PostMapping
    public ProductDto createProduct(@ModelAttribute ProductDto productDto) {
        Product product = productService.createOrUpdate(conversionService.convert(productDto, Product.class));
        return conversionService.convert(product, ProductDto.class);
    }

}
