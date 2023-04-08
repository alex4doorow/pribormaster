package com.sir.richard.boss.bl.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Table(name = "SR_ORDER_DELIVERY")
@Setter
@Getter
@NoArgsConstructor
public class TeOrderDelivery implements BaseEntity<Long>, Serializable {

    @Serial
    private static final long serialVersionUID = -6046841475706353701L;

    @Id
    @SequenceGenerator(name = "SR_SEQUENCE", sequenceName = "SR_SEQUENCE", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SR_SEQUENCE")
    @Column(name = "ID", updatable = false)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "ORDER_ID", referencedColumnName = "ID")
    private TeOrder order;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "DELIVERY_TYPE", referencedColumnName = "ID")
    private TeWikiOrderDelivery type;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "PAYMENT_DELIVERY_TYPE", referencedColumnName = "ID")
    private TeWikiOrderPaymentDelivery paymentType;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "ADDRESS_ID", referencedColumnName = "ID")
    private TeAddress address;

    @Column(name = "PRICE", nullable = false)
    private BigDecimal price;

    @Column(name = "CUSTOMER_PRICE", nullable = false)
    private BigDecimal customerPrice;

    @Column(name = "SELLER_PRICE", nullable = false)
    private BigDecimal sellerPrice;

    @Column(name = "TRACK_CODE")
    private String trackCode;
}
