package com.sir.richard.boss.services.converters.out.dto;

import com.sir.richard.boss.model.data.Product;
import com.sir.richard.boss.rest.dto.DtoProduct;
import com.sir.richard.boss.services.converters.IOConverter;
import org.springframework.stereotype.Component;

@Component
public class OutDtoProductConverter implements IOConverter<Product, DtoProduct> {

    @Override
    public DtoProduct convertTo(Product product) {
        DtoProduct dtoProduct = new DtoProduct();
        dtoProduct.setId(product.getId());
        dtoProduct.setSku(product.getSku());
        dtoProduct.setName(product.getViewUnEscapeName());


        return dtoProduct;
    }
}
