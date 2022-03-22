package com.brm.cuisine.service.impl;

import com.brm.cuisine.entity.Lead;
import com.brm.cuisine.repo.RegistrationRepository;
import com.brm.cuisine.service.RegistrationService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class RegistrationServiceImpl implements RegistrationService {

    private final RegistrationRepository registrationRepository;


    @Override
    public String createUser(Lead lead) {
        registrationRepository.save(lead);
        return String.format("%s%s", lead.getEmail(), lead.getName());
    }
}
