package com.sir.richard.boss.services.converters.out.model;

import com.sir.richard.boss.bl.entity.VeProduct;
import com.sir.richard.boss.model.data.Product;
import com.sir.richard.boss.services.converters.IOConverter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class OutLightProductConverter implements IOConverter<VeProduct, Product> {

    @Override
    public Product convertTo(VeProduct veProduct) {
        Product product = new Product(veProduct.getId(), veProduct.getName());
        product.setModel(veProduct.getModel());
        product.setSku(veProduct.getSku());

        product.setQuantity(veProduct.getProductQuantity());
        if (veProduct.getStockQuantity() != null) {
            product.setStockQuantity(veProduct.getStockQuantity());
        }
        if (veProduct.getSupplierQuantity() != null) {
            product.setSupplierQuantity(veProduct.getSupplierQuantity());
        }
        product.setPrice(veProduct.getProductPrice());
        if (veProduct.getSupplierPrice() != null) {
            product.setSupplierPrice(veProduct.getSupplierPrice());
        }
        product.setVisible(true);
        return product;
    }
}
