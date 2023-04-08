package com.sir.richard.boss.bl.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "OC_PRODUCT")
@Setter
@Getter
@NoArgsConstructor
public class TeProduct implements BaseEntity<Long>, Serializable {

    @Serial
    private static final long serialVersionUID = 2655979800107746234L;

    @Id
    @SequenceGenerator(name = "SR_SEQUENCE", sequenceName = "SR_SEQUENCE", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SR_SEQUENCE")
    @Column(name = "PRODUCT_ID", updatable = false)
    private Long id;

    @Column(name = "MODEL", length = 64, nullable = false)
    private String model;

    @Column(name = "SKU", length = 64, nullable = false)
    private String sku;

    @Column(name = "QUANTITY", nullable = false)
    private Integer quantity;

    @Column(name = "STATUS", nullable = false)
    private Integer status;

    @Column(name = "DATE_ADDED")
    private LocalDateTime addedDate;

    @Column(name = "DATE_MODIFIED")
    private LocalDateTime modifiedDate;

    @Override
    public String toString() {
        return "product: {" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", sku='" + sku + '\'' +
                ", quantity=" + quantity +
                ", status=" + status +
                ", addedDate=" + addedDate +
                ", modifiedDate=" + modifiedDate +
                '}';
    }
}
