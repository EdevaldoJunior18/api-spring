package com.presentation.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.domain.entities.dto.UserDTO;

/**
 *
 * @author Ed
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/create")
    public UserDTO createUser(UserDTO dto) {
        return userService.createUser(dto);
    }

    @GetMapping("/find")
    public UserDTO findUser(String document) {
        return userService.findUser(document);
    }

    @PatchMapping("/update")
    public UserDTO updateUser(String document) {
        return userService.updateUser(document);
    }

    @DeleteMapping("/delete")
    public UserDTO deleteUser(String document, String password) {
        return userService.deleteUser(document, password);
    }

}