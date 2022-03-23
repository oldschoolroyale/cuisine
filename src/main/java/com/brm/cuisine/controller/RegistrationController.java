package com.brm.cuisine.controller;

import com.brm.cuisine.entity.Lead;
import com.brm.cuisine.service.RegistrationService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("registration")
@RequiredArgsConstructor
@Slf4j
public class RegistrationController {

    private final RegistrationService registrationService;

    @PostMapping
    public ResponseEntity<String> signUp(@RequestBody Lead lead){
        String token = registrationService.createUser(lead);
        return new ResponseEntity<>(
                token,
                HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<String> signIn(@RequestParam("username") String username,
                                         @RequestParam("password") String password){
        String token = registrationService.findUserByUsernameAndPassword(username, password);
        if (token == null){
            throw new IllegalArgumentException("Error, user not exists");
        }
        return new ResponseEntity<>(
                token,
                HttpStatus.OK);
    }
}
