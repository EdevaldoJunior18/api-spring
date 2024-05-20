package com.presentation.controllers;

import org.springframework.stereotype.Service;

import com.domain.entities.dto.UserDTO;

/**
 *
 * @author Ed
 */
@Service
public class UserService {

    public UserDTO createUser(UserDTO dto) {

        System.out.println("teste");

        System.out.println("test2");

        return null;
    }

    public UserDTO findUser(String document) {
        return null;
    }

    public UserDTO updateUser(String document) {
        return null;
    }

    public UserDTO deleteUser(String document, String password) {
        return null;
    }

}
