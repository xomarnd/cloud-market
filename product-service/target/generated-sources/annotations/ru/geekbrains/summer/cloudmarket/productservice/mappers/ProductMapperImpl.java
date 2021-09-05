package ru.geekbrains.summer.cloudmarket.productservice.mappers;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import ru.geekbrains.summer.cloudmarket.dto.ProductDto;
import ru.geekbrains.summer.cloudmarket.productservice.entities.Product;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-05T22:19:40+0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.11 (Ubuntu)"
)
@Component
public class ProductMapperImpl implements ProductMapper {

    @Override
    public Product convert(ProductDto source) {
        if ( source == null ) {
            return null;
        }

        Product product = new Product();

        product.setId( source.getId() );
        product.setTitle( source.getTitle() );
        product.setPrice( source.getPrice() );

        return product;
    }
}
