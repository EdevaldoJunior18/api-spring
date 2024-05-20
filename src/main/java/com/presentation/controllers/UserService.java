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
        var response = new UserDTO();

        response.setName("teste");

        return response;
    }

    public UserDTO findUser(String document) {
        var response = new UserDTO();

        response.setName("teste");

        return response;
    }

    public UserDTO updateUser(String document) {
        var response = new UserDTO();

        response.setName("teste");

        return response;
    }

    public UserDTO deleteUser(String document, String password) {
        var response = new UserDTO();

        response.setName("teste");

        return response;
    }

}
