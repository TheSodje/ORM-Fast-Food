package com.sod.mapper;

import com.sod.dto.ProductDTO;
import com.sod.entity.Product;

import java.util.function.Function;

public class ProductDTOMapper implements Function<Product, ProductDTO> {

    @Override
    public ProductDTO apply(Product product) {
        return new ProductDTO(product.getId(), product.getName(), product.getType(), product.getPrice());
    }
}