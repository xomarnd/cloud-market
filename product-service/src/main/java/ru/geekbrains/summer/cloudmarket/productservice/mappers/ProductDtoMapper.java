package ru.geekbrains.summer.cloudmarket.productservice.mappers;

import org.mapstruct.Mapper;
import org.springframework.core.convert.converter.Converter;
import ru.geekbrains.summer.cloudmarket.dto.ProductDto;
import ru.geekbrains.summer.cloudmarket.productservice.entities.Product;

@Mapper(componentModel = "spring")
public interface ProductDtoMapper extends Converter<Product, ProductDto> {

    @Override
    ProductDto convert(Product source);

}
