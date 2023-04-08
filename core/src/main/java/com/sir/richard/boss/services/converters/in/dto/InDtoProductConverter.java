package com.sir.richard.boss.services.converters.in.dto;

import com.sir.richard.boss.model.data.Product;
import com.sir.richard.boss.rest.dto.DtoProduct;
import com.sir.richard.boss.services.converters.IOConverter;
import org.springframework.stereotype.Component;

@Component
public class InDtoProductConverter implements IOConverter<DtoProduct, Product> {

    @Override
    public Product convertTo(DtoProduct dtoProduct) {

        Product product = new Product(dtoProduct.getId(), dtoProduct.getName());
        product.setSku(dtoProduct.getSku());
        /*
        product.setModel(dtoProduct.getModel());

        product.setQuantity(dtoProduct.getProductQuantity());
        if (dtoProduct.getStockQuantity() != null) {
            product.setStockQuantity(dtoProduct.getStockQuantity());
        }
        if (dtoProduct.getSupplierQuantity() != null) {
            product.setSupplierQuantity(dtoProduct.getSupplierQuantity());
        }
        product.setPrice(dtoProduct.getProductPrice());
        if (dtoProduct.getSupplierPrice() != null) {
            product.setSupplierPrice(dtoProduct.getSupplierPrice());
        }
        product.setVisible(true);

        */
        return product;
    }
}
