package com.sir.richard.boss.bl.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "SR_PERSON")
@Setter
@Getter
@NoArgsConstructor
public class TePerson implements BaseEntity<Long>, Serializable {

    @Serial
    private static final long serialVersionUID = 518746571848990438L;

    @Id
    @SequenceGenerator(name = "SR_SEQUENCE", sequenceName = "SR_SEQUENCE", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SR_SEQUENCE")
    @Column(name = "ID", updatable = false)
    private Long id;

    @Column(name = "FIRST_NAME", nullable = false)
    private String firstName;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name = "MIDDLE_NAME")
    private String middleName;

    @Column(name = "COUNTRY_ISO_CODE_2")
    private String countryIsoCode;

    @Column(name = "PHONE_NUMBER")
    private String phoneNumber;

    @Column(name = "EMAIL")
    private String email;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TePerson tePerson = (TePerson) o;
        return Objects.equals(id, tePerson.id) && Objects.equals(firstName, tePerson.firstName)
                && Objects.equals(lastName, tePerson.lastName) && Objects.equals(middleName, tePerson.middleName)
                && Objects.equals(countryIsoCode, tePerson.countryIsoCode)
                && Objects.equals(phoneNumber, tePerson.phoneNumber)
                && Objects.equals(email, tePerson.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, middleName, countryIsoCode, phoneNumber, email);
    }
}
