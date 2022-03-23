package com.brm.cuisine.repo;

import com.brm.cuisine.entity.Lead;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RegistrationRepository extends JpaRepository<Lead, Long> {
    Lead findByUsernameAndPassword(String username, String password);
}
