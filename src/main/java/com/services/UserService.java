package com.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.domain.entities.dto.UserDTO;
import com.domain.repositories.IUserRepository;
import com.domain.usecases.CreateUser;
import com.domain.usecases.DeleteUser;
import com.domain.usecases.FindUser;
import com.domain.usecases.UpdateUser;

/**
 *
 * @author Ed
 */
@Service
public class UserService {

    @Autowired
    private IUserRepository userRepository;

    public UserDTO createUser(UserDTO dto) {

        var create = new CreateUser(userRepository);
        return create.execute(dto);

    }

    public UserDTO findUser(String document) {
        var find = new FindUser(userRepository);
        return find.execute(document);

    }

    public UserDTO updateUser(String document, String password) {
        var update = new UpdateUser(userRepository);
        return update.execute(document, password);

    }

    public UserDTO deleteUser(String document, String password) {
        var delete = new DeleteUser(userRepository);
        return delete.execute(document, password);

    }

}
