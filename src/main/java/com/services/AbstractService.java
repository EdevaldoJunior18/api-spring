package com.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.domain.repositories.IUserRepository;

/**
 *
 * @author Ed
 */
public abstract class AbstractService {

    @Autowired
    IUserRepository userRepository;

}
