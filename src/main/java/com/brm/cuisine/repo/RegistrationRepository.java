package com.brm.cuisine.repo;

import com.brm.cuisine.entity.Lead;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegistrationRepository extends JpaRepository<Lead, Long> {
}
