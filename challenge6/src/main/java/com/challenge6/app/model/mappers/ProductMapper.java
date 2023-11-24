package com.challenge6.app.model.mappers;

import com.challenge6.app.model.Product;
import com.challenge6.app.model.dtos.ProductDto;
import com.challenge6.app.model.dtos.ProductUpdateDto;
import org.mapstruct.Mapper;

@Mapper
public interface ProductMapper {
    Product productDtoToProduct(ProductDto productDto);

    ProductDto productToProductDto(Product product);

    Product productUpdateDtoToProduct(ProductUpdateDto productUpdateDto);
}
