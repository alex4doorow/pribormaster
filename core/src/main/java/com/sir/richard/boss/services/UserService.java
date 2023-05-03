package com.sir.richard.boss.services;

import com.sir.richard.boss.bl.entity.TeUser;
import com.sir.richard.boss.bl.jpa.TeUserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class UserService {

    public static String SYSTEM_USER = "system";
    public static String SCHEDULER_USER = "scheduler";

    @Autowired
    private TeUserRepository userRepository;

    public TeUser getUserByName(String userName) {
        return userRepository.findByUsername(userName);
    }

    public TeUser getSystem() {
        return getUserByName(SYSTEM_USER);
    }

    public TeUser getScheduler() {
        return getUserByName(SCHEDULER_USER);
    }
}
