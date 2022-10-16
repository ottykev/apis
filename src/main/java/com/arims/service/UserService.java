package com.arims.service;

import com.arims.model.User;
import com.arims.web.dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

@Service
public interface UserService extends UserDetailsService {

    User save(UserRegistrationDto registrationDto);
}
