package com.brm.cuisine.service;

import com.brm.cuisine.entity.Lead;

public interface RegistrationService {

    String createUser(Lead lead);

    String findUserByUsernameAndPassword(String username, String password);
}
