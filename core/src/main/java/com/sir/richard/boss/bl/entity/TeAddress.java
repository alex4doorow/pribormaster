package com.sir.richard.boss.bl.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "SR_ADDRESS")
@Setter
@Getter
@NoArgsConstructor
public class TeAddress implements BaseEntity<Long>, Serializable {

    @Serial
    private static final long serialVersionUID = 460930127400986315L;

    @Id
    @SequenceGenerator(name = "SR_SEQUENCE", sequenceName = "SR_SEQUENCE", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SR_SEQUENCE")
    @Column(name = "ID", updatable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "TYPE", referencedColumnName = "ID")
    private TeWikiAddressType type;

    @Column(name = "COUNTRY_ISO_CODE_2")
    private String countryCode;

    @Column(name = "POST_CODE")
    private String postCode;

    @Column(name = "CITY_ID")
    private Long cityId;

    @Column(name = "CITY")
    private String city;

    @Column(name = "PVZ")
    private String pvz;

    @Column(name = "ADDRESS")
    private String address;

    @Column(name = "ANNOTATION")
    private String annotation;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TeAddress teAddress = (TeAddress) o;
        return Objects.equals(id, teAddress.id) && Objects.equals(type, teAddress.type)
                && Objects.equals(countryCode, teAddress.countryCode) && Objects.equals(postCode, teAddress.postCode)
                && Objects.equals(cityId, teAddress.cityId) && Objects.equals(city, teAddress.city)
                && Objects.equals(pvz, teAddress.pvz) && Objects.equals(address, teAddress.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, type, countryCode, postCode, cityId, city, pvz, address);
    }

}
