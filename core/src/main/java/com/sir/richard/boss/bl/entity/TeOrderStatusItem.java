package com.sir.richard.boss.bl.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "SR_ORDER_STATUS")
@Setter
@Getter
@NoArgsConstructor
public class TeOrderStatusItem implements BaseEntity<Long>, Serializable {

    @Serial
    private static final long serialVersionUID = -4444156969788122160L;
    @Id
    @SequenceGenerator(name = "SR_SEQUENCE", sequenceName = "SR_SEQUENCE", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SR_SEQUENCE")
    @Column(name = "ID", updatable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "ORDER_ID", nullable = false)
    private TeOrder order;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "STATUS", referencedColumnName = "ID", nullable = false)
    private TeWikiOrderStatus status;

    @Column(name = "CRM_STATUS")
    private String crmStatus;

    @Column(name = "CRM_SUB_STATUS")
    private String crmSubStatus;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "USER_ADDED", referencedColumnName = "ID")
    private TeUser userAdded;

    @Column(name = "DATE_ADDED")
    private LocalDateTime dateAdded;

}
