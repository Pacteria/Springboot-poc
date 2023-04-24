package com.example.registrationlogindemo.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.example.registrationlogindemo.entity.User;
import com.example.registrationlogindemo.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService {

    User findByEmail(String email);

    User save(UserRegistrationDto registration);
}
