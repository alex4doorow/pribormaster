package com.sir.richard.boss.bl.entity;

import com.sir.richard.boss.utils.DateTimeUtils;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "SR_SYS_USER")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class TeUser implements BaseEntity<Long>, Serializable {

    @Serial
    private static final long serialVersionUID = 6672826725536635358L;

    @Id
    @SequenceGenerator(name = "SR_SEQUENCE", sequenceName = "SR_SEQUENCE", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SR_SEQUENCE")
    @Column(name = "ID", updatable = false)
    private Long id;

    @Column(name = "NAME", length = 64, nullable = false)
    private String username;

    @Column(name = "PASSWORD", length = 100, nullable = false)
    private String password;

    @Transient
    private String passwordConfirm;

    @Column(name = "EMAIL", length = 100, nullable = false)
    private String email;

    @Column(name = "LAST_LOGIN")
    private LocalDateTime lastLogin;

    @ManyToMany(cascade = { CascadeType.ALL }, fetch = FetchType.EAGER)
    @JoinTable(
            name = "SR_SYS_USER_ROLES",
            joinColumns = { @JoinColumn(name = "USER_ID") },
            inverseJoinColumns = { @JoinColumn(name = "ROLE_ID") })
    private Set<TeRole> roles = new HashSet<>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TeUser seUser = (TeUser) o;
        return Objects.equals(id, seUser.id) &&
                Objects.equals(username, seUser.username) &&
                Objects.equals(password, seUser.password) &&
                Objects.equals(passwordConfirm, seUser.passwordConfirm) &&
                Objects.equals(email, seUser.email) &&
                Objects.equals(lastLogin, seUser.lastLogin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, password, passwordConfirm, email, lastLogin);
    }

    @Override
    public String toString() {

        return "user: {" +
                "id=" + id +
                ", name='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", lastLogin=" + DateTimeUtils.formatLocalDateTime(lastLogin, DateTimeUtils.DATE_FORMAT_UTC) +
                ", roles=" + roles.stream().map(TeRole::getName).toList() +
                "}";
    }
}
