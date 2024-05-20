package com.domain.repositories;

import com.domain.entities.bo.UserBO;

/**
 *
 * @author Ed
 */
public interface IUserRepository {

    UserBO create(UserBO bo);

    UserBO findBy(String document);

    UserBO merge(UserBO bo);

    void delete(UserBO bo);

}
