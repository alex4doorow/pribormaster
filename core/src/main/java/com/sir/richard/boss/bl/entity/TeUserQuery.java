package com.sir.richard.boss.bl.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "SR_SYS_USER_QUERY")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class TeUserQuery {

    @Id
    @SequenceGenerator(name = "SR_SEQUENCE", sequenceName = "SR_SEQUENCE", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SR_SEQUENCE")
    @Column(name = "ID", updatable = false)
    private Long id;

    @Column(name = "CODE", nullable = false)
    private String code;

    @Column(name = "FORM", length = 30, nullable = false)
    private String form;

    @Column(name = "VALUE", length = 256, nullable = false)
    private String value;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "USER_ID", referencedColumnName = "ID")
    private TeUser user;

}
