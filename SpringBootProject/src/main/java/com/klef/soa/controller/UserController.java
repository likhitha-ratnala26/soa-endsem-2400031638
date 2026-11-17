package com.klef.soa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.klef.soa.entity.LoginRequest;
import com.klef.soa.service.UserService;

@RestController
@RequestMapping("/api/auth")
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody LoginRequest request) {

        boolean valid = service.validateLogin(
                request.getUsername(),
                request.getPassword()
        );

        if (valid) {
            return ResponseEntity.status(201)
                    .body("Authentication successful");
        } else {
            return ResponseEntity.status(401)
                    .body("Authentication failed");
        }
    }
}
