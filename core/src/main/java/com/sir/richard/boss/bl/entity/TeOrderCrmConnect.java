package com.sir.richard.boss.bl.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;

@Entity
@Table(name = "SR_ORDER_CRM_CONNECT")
@Setter
@Getter
@NoArgsConstructor
public class TeOrderCrmConnect implements BaseEntity<Long>, Serializable {

    @Serial
    private static final long serialVersionUID = 7782441088240761436L;

    @Id
    @SequenceGenerator(name = "SR_SEQUENCE", sequenceName = "SR_SEQUENCE", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SR_SEQUENCE")
    @Column(name = "ID", updatable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "ORDER_ID", nullable = false)
    private TeOrder order;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CRM_ID", referencedColumnName = "ID")
    private TeWikiCrmType type;

    @Column(name = "PARENT_CRM_ID")
    private Long parentId;

    @Column(name = "PARENT_CRM_CODE")
    private String parentCode;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CRM_STATUS", referencedColumnName = "ID")
    private TeWikiCrmStatus status;

}
