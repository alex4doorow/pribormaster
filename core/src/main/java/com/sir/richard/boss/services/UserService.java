package com.sir.richard.boss.services;

import com.sir.richard.boss.bl.jpa.TeUserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;

@Slf4j
@Service
public class UserService {

    @Autowired
    private TeUserRepository userRepository;
    @Autowired
    private EntityManager entityManager;

    /*
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
        return user;
    }

    */
}
