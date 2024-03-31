package com.sir.richard.boss.bl.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Table(name = "SR_V_PRODUCT")
@Setter
@Getter
@NoArgsConstructor
public class VeProduct implements BaseEntity<Long>, Serializable {

    @Serial
    private static final long serialVersionUID = 7763171731215657376L;
    @Id
    @Column(name = "PRODUCT_ID", updatable = false)
    private Long id;

    @Column(name = "MODEL", length = 64, nullable = false)
    private String model;

    @Column(name = "NAME", length = 64, nullable = false)
    private String name;

    @Column(name = "SKU", length = 64, nullable = false)
    private String sku;

    @Column(name = "PRODUCT_QUANTITY", nullable = false)
    private Integer productQuantity;
    @Column(name = "STOCK_QUANTITY")
    private Integer stockQuantity;
    @Column(name = "SUPPLIER_QUANTITY")
    private Integer supplierQuantity;

    @Column(name = "PRODUCT_PRICE", nullable = false)
    private BigDecimal productPrice;

    @Column(name = "SUPPLIER_PRICE")
    private BigDecimal supplierPrice;

    @Column(name = "STATUS", nullable = false)
    private Integer status;

    @Override
    public String toString() {
        return "product: {" +
                "id=" + id +
                ", sku='" + sku + '\'' +
                ", name='" + name + '\'' +
                ", stockQuantity=" + stockQuantity +
                ", status=" + status +
                '}';
    }
}
