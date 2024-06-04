package com.services;

import org.springframework.stereotype.Service;

import com.domain.entities.dto.UserDTO;

/**
 *
 * @author Ed
 */
@Service
public class UserService {

    public UserDTO createUser(UserDTO dto) {
        // var create = new CreateUser(userRepository);
        // return create.execute(dto);

        var teste = new UserDTO();

        teste.setName("Apenas um teste!");

        return teste;
    }

    public UserDTO findUser(String document) {
        // var find = new FindUser(userRepository);
        // return find.execute(document);

        return null;
    }

    public UserDTO updateUser(String document, String password) {
        // var update = new UpdateUser(userRepository);
        // return update.execute(document, password);

        return null;
    }

    public UserDTO deleteUser(String document, String password) {
        // var delete = new DeleteUser(userRepository);
        // return delete.execute(document, password);

        return null;
    }

}
