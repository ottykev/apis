package com.arims.web;

import com.arims.model.User;
import com.arims.service.UserService;
import com.arims.web.dto.UserRegistrationDto;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;



@RestController
@RequestMapping
public class MainController {

    private UserService userService;

    public MainController(UserService userService) {
        super();
        this.userService = userService;
    }







}
