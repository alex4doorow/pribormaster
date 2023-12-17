package com.sir.richard.boss.services;

import com.sir.richard.boss.bl.entity.TeUser;
import com.sir.richard.boss.bl.jpa.TeUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.io.Serial;
import java.time.LocalDateTime;
import java.util.Collection;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Serial
    private static final long serialVersionUID = 7139547495188085880L;

    @Autowired
    private EntityManager entityManager;
    @Autowired
    private TeUserRepository userRepository;

    @Transactional
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        TeUser user = userRepository.findByUsername(username);
        if (user == null) {
            throw new UsernameNotFoundException("User not found");
        }
        user = entityManager.find(TeUser.class, user.getId());
        user.setLastLogin(LocalDateTime.now());
        entityManager.merge(user);
        return createUserDetails(user);
    }

    private UserDetails createUserDetails(TeUser user) {
        return new UserDetails() {

            @Serial
            private static final long serialVersionUID = -5262050463012882394L;

            @Override
            public boolean isAccountNonExpired() {
                return true;
            }

            @Override
            public boolean isAccountNonLocked() {
                return true;
            }

            @Override
            public boolean isCredentialsNonExpired() {
                return true;
            }

            @Override
            public boolean isEnabled() {
                return true;
            }

            @Override
            public Collection<? extends GrantedAuthority> getAuthorities() {
                return user.getRoles().stream().map(role -> new GrantedAuthority() {

                    @Serial
                    private static final long serialVersionUID = 7139547495188085880L;

                    @Override
                    public String getAuthority() {
                        return role.getName();
                    }
                }
                ).toList();
            }

            @Override
            public String getPassword() {
                return user.getPassword();
            }

            @Override
            public String getUsername() {
                return user.getUsername();
            }

        };
    }
}
