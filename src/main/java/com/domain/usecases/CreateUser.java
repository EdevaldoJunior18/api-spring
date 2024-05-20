package com.domain.usecases;

import com.domain.entities.dto.UserDTO;
import com.domain.entities.mappers.UserMapper;
import com.domain.repositories.IUserRepository;

public class CreateUser {

    IUserRepository userRepository;

    public CreateUser(IUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserDTO execute(UserDTO dto) {
        var bo = userRepository.create(UserMapper.toBO(dto));

        return UserMapper.toDTO(bo);
    }

}
