package com.sir.richard.boss.bl.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "SR_ORDER")
@Setter
@Getter
@NoArgsConstructor
public class TeOrder implements BaseEntity<Long>, Serializable {

    @Serial
    private static final long serialVersionUID = -4187152997359262377L;

    @Id
    @SequenceGenerator(name = "SR_SEQUENCE", sequenceName = "SR_SEQUENCE", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SR_SEQUENCE")
    @Column(name = "ID", updatable = false)
    private Long id;

    @Column(name = "ORDER_NO", nullable = false)
    private Integer orderNo;

    @Column(name = "ORDER_SUB_NO", nullable = false)
    private Integer orderSubNo;

    @Column(name = "ORDER_YEAR", nullable = false)
    private Integer orderYear;

    @Column(name = "ORDER_DATE", nullable = false)
    private LocalDate orderDate;

    @Column(name = "STORE_ID", nullable = false)
    private Integer storeId;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "ORDER_TYPE", referencedColumnName = "ID")
    private TeWikiOrderType orderType;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "SOURCE_TYPE", referencedColumnName = "ID")
    private TeWikiOrderSource sourceType;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "ADVERT_TYPE", referencedColumnName = "ID")
    private TeWikiOrderAdvert advertType;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "PAYMENT_TYPE", referencedColumnName = "ID")
    private TeWikiOrderPayment paymentType;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CATEGORY_PRODUCT_ID", referencedColumnName = "ID")
    private TeWikiProductCategory productCategory;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH, CascadeType.DETACH})
    //@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "CUSTOMER_ID", referencedColumnName = "ID")
    private TeCustomer customer;

    @OneToOne(mappedBy = "order", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private TeOrderDelivery delivery;

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<TeOrderItem> items;

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<TeOrderStatusItem> statuses;

    @Column(name = "AMOUNT_TOTAL", nullable = false)
    private BigDecimal amountTotal;

    @Column(name = "AMOUNT_TOTAL_WITH_DELIVERY", nullable = false)
    private BigDecimal amountTotalWithDelivery;

    @Column(name = "AMOUNT_BILL", nullable = false)
    private BigDecimal amountBill;

    @Column(name = "AMOUNT_SUPPLIER", nullable = false)
    private BigDecimal amountSupplier;

    @Column(name = "AMOUNT_MARGIN", nullable = false)
    private BigDecimal amountMargin;

    @Column(name = "AMOUNT_POSTPAY", nullable = false)
    private BigDecimal amountPostpay;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "STATUS", referencedColumnName = "ID", nullable = false)
    private TeWikiOrderStatus status;

    @Column(name = "STATUS_EMAIL")
    private Integer emailStatus;

    @Column(name = "ANNOTATION", length = 256)
    private String annotation;

//    OFFER_COUNT_DAY INT NULL, /* ЧИСЛО ДНЕЙ СРОКА ПРЕДЛОЖЕНИЯ */
//    OFFER_DATE_START TIMESTAMP NULL, /* ДАТА НАЧАЛА СРОКА ДЕЙСТВИЯ ПРЕДЛОЖЕНИЯ */

    // orderStatuses

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "USER_ADDED", referencedColumnName = "ID")
    private TeUser userAdded;

    @Column(name = "DATE_ADDED")
    private LocalDateTime dateAdded;

    @Column(name = "DATE_MODIFIED")
    private LocalDateTime dateModified;

    @Override
    public String toString() {
        return "order {" +
                "id=" + id +
                ", no=" + orderNo +
                ", orderDate=" + orderDate +
                ", orderType=" + orderType.getId() +
                ", status=" + status.getId() +
                ", amountTotal=" + amountTotal +
                '}';
    }
}
