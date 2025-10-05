package com.julio.springcloud.msvc_users.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.julio.springcloud.msvc_users.entity.User;
import com.julio.springcloud.msvc_users.repository.UserRepository;
import com.julio.springcloud.msvc_users.service.UserService;

@Service
public class UserServiceimpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private Environment environment;

    @Override
    public List<User> findAll() {
        return ((List<User>) userRepository.findAll()).stream().map(user ->{
            user.setPort(Integer.parseInt(environment.getProperty("local.server.port")));
            return user;
        }).collect(Collectors.toList());
    }

    @Override
    public Optional<User> findById(Long id) {
        return userRepository.findById(id).map(user -> {
            return user;
        });
    }

}
