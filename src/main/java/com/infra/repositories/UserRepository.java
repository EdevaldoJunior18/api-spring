package com.infra.repositories;

import org.springframework.stereotype.Repository;

import com.domain.entities.bo.UserBO;
import com.domain.repositories.IUserRepository;

@Repository
public class UserRepository implements IUserRepository {

    @Override
    public UserBO create(UserBO bo) {
        throw new UnsupportedOperationException("Unimplemented method 'create'");
    }

    @Override
    public UserBO findBy(String document) {
        throw new UnsupportedOperationException("Unimplemented method 'findBy'");
    }

    @Override
    public UserBO merge(UserBO bo) {
        throw new UnsupportedOperationException("Unimplemented method 'Merge'");
    }

    @Override
    public void delete(UserBO bo) {
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

}
