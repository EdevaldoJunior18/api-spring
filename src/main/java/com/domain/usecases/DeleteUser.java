package com.domain.usecases;

import com.domain.entities.dto.UserDTO;
import com.domain.entities.mappers.UserMapper;
import com.domain.repositories.IUserRepository;

/**
 *
 * @author Ed
 */
public class DeleteUser {

    IUserRepository userRepository;

    public DeleteUser(IUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserDTO execute(String document, String password) {
        var bo = userRepository.findBy(document);

        return UserMapper.toDTO(bo);
    }

}
