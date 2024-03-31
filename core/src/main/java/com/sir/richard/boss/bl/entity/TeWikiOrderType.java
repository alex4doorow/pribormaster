package com.sir.richard.boss.bl.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serial;
import java.io.Serializable;

@Entity
@Table(name = "SR_WIKI_ORDER_TYPE")
@Setter
@Getter
@NoArgsConstructor
public class TeWikiOrderType implements BaseEntity<Long>, Serializable {

    @Serial
    private static final long serialVersionUID = 5548233397732313424L;

    @Id
    @Column(name = "ID", updatable = false)
    private Long id;

    @Column(name = "ANNOTATION")
    private String annotation;
}
