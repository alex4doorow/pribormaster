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

@Entity
@Table(name = "SR_WIKI_ORDER_DELIVERY")
@Setter
@Getter
@NoArgsConstructor
public class TeWikiOrderDelivery implements BaseEntity<Long>, Serializable {

    @Serial
    private static final long serialVersionUID = 3719911333760315708L;

    @Id
    @Column(name = "ID", updatable = false)
    private Long id;

    @Column(name = "ANNOTATION")
    private String annotation;
}
