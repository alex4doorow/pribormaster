package com.sir.richard.boss.bl.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "SR_CUSTOMER")
@Setter
@Getter
@NoArgsConstructor
public class TeCustomer implements BaseEntity<Long>, Serializable {

    @Serial
    private static final long serialVersionUID = 7116303943090207902L;

    @Id
    @SequenceGenerator(name = "SR_SEQUENCE", sequenceName = "SR_SEQUENCE", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SR_SEQUENCE")
    @Column(name = "ID", updatable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "PERSON_ID", referencedColumnName = "ID")
    private TePerson person;

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<TeCustomerCompany> customerCompanies;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "TYPE", referencedColumnName = "ID")
    private TeWikiCustomerType type;

    @ManyToMany(cascade = {CascadeType.ALL}, fetch = FetchType.LAZY)
    @JoinTable(
            name = "SR_CUSTOMER_ADDRESS",
            joinColumns = { @JoinColumn(name = "CUSTOMER_ID") },
            inverseJoinColumns = { @JoinColumn(name = "ADDRESS_ID") })
    private Set<TeAddress> addresses = new HashSet<>();

    @ManyToMany(cascade = {CascadeType.ALL}, fetch = FetchType.LAZY)
    @JoinTable(
            name = "SR_CUSTOMER_CONTACT",
            joinColumns = { @JoinColumn(name = "CUSTOMER_ID") },
            inverseJoinColumns = { @JoinColumn(name = "PERSON_ID") })
    private Set<TePerson> contacts = new HashSet<>();
}
