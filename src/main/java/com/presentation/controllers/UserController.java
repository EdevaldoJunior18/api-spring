package com.presentation.controllers;

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
public class UserController extends AbstractController {

    @PostMapping
    public UserDTO createUser(UserDTO dto) {
        return userService.createUser(dto);
    }

    @GetMapping
    public UserDTO findUser(String document) {
        return userService.findUser(document);
    }

    @PatchMapping
    public UserDTO updateUser(String document, String password) {
        return userService.updateUser(document, password);
    }

    @DeleteMapping
    public UserDTO deleteUser(String document, String password) {
        return userService.deleteUser(document, password);
    }

}