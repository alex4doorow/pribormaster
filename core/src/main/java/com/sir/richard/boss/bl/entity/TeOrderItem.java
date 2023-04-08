package com.sir.richard.boss.bl.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Table(name = "SR_ORDER_ITEM")
@Setter
@Getter
@NoArgsConstructor
public class TeOrderItem implements BaseEntity<Long>, Serializable {

    @Serial
    private static final long serialVersionUID = 4013138480849279429L;

    @Id
    @SequenceGenerator(name = "SR_SEQUENCE", sequenceName = "SR_SEQUENCE", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SR_SEQUENCE")
    @Column(name = "ID", updatable = false)
    private Long id;

    @Column(name = "NO")
    private Integer no;

    @ManyToOne
    @JoinColumn(name = "ORDER_ID", nullable = false)
    private TeOrder order;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PRODUCT_ID", referencedColumnName = "PRODUCT_ID")
    private VeProduct product;

    @Column(name = "PRICE")
    private BigDecimal price;

    @Column(name = "QUANTITY")
    private Integer quantity;

    @Column(name = "DISCOUNT_RATE")
    private BigDecimal discountRate;

    @Column(name = "AMOUNT")
    private BigDecimal amount;
    @Column(name = "AMOUNT_SUPPLIER")
    private BigDecimal supplierAmount;


}
