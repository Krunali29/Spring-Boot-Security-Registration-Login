package com.bridgelabz.registrationlogin.service;

import com.bridgelabz.registrationlogin.model.User;
import com.bridgelabz.registrationlogin.web.dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User save(UserRegistrationDto registrationDto);
}
