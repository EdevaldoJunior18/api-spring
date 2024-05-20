package com.presentation.controllers;

import org.springframework.beans.factory.annotation.Autowired;

import com.services.UserService;

public abstract class AbstractController {

    @Autowired
    UserService userService;

}
