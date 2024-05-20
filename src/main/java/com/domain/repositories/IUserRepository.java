package com.domain.repositories;

import com.domain.entities.bo.UserBO;

public interface IUserRepository {

    UserBO create(UserBO bo);

    UserBO findBy(String document);

    UserBO Merge(UserBO bo);

}
