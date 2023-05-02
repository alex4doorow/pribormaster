package com.sir.richard.boss.services;

import com.sir.richard.boss.bl.jpa.TeUserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class UserService {

    @Autowired
    private TeUserRepository userRepository;

}
