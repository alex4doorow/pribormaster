package com.sir.richard.boss.bl.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "SR_SYS_ROLE")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class TeRole implements BaseEntity<Long>, Serializable {

    @Serial
    private static final long serialVersionUID = -983938263461851255L;

    @Id
    @SequenceGenerator(name = "SR_SEQUENCE", sequenceName = "SR_SEQUENCE", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SR_SEQUENCE")
    @Column(name = "ID", updatable = false)
    private Long id;

    @Column(name = "NAME", length = 64, nullable = false)
    private String name;

    @ManyToMany(mappedBy = "roles")
    private Set<TeUser> users;

    public TeRole(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TeRole seRole = (TeRole) o;
        return Objects.equals(id, seRole.id) && Objects.equals(name, seRole.name) && Objects.equals(users, seRole.users);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, users);
    }

    @Override
    public String toString() {
        return "SeRole {" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
