package com.sir.richard.boss.bl.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serial;
import java.io.Serializable;

@Entity
@Table(name = "SR_WIKI_CUSTOMER_TYPE")
@Setter
@Getter
@NoArgsConstructor
public class TeWikiCustomerType implements BaseEntity<Long>, Serializable {

    @Serial
    private static final long serialVersionUID = 5548233397732313424L;

    @Id
    @Column(name = "ID", updatable = false)
    private Long id;

    @Column(name = "ANNOTATION")
    private String annotation;
}
