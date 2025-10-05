package com.julio.springcloud.msvc_users.service;

import java.util.List;
import java.util.Optional;

import com.julio.springcloud.msvc_users.entity.User;


public interface UserService {

    List<User> findAll();
    Optional<User> findById(Long id);

}
