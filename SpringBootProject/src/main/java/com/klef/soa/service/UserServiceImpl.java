package com.klef.soa.service;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private static final String USERNAME = "admin";
    private static final String PASSWORD = "pass123";

    @Override
    public boolean validateLogin(String username, String password) {

        if (USERNAME.equals(username) && PASSWORD.equals(password)) {
            return true;
        } else {
            return false;
        }
    }
}
