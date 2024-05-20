package com.domain.usecases;

import com.domain.entities.dto.UserDTO;
import com.domain.entities.mappers.UserMapper;
import com.domain.repositories.IUserRepository;

/**
 *
 * @author Ed
 */
public class UpdateUser {

    IUserRepository userRepository;

    public UpdateUser(IUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserDTO execute(String document, String password) {
        var bo = userRepository.findBy(document);

        // atualiza

        // merge

        return UserMapper.toDTO(bo);
    }

}
