package com.julio.springcloud.msvc_users.repository;

import org.springframework.data.repository.CrudRepository;

import com.julio.springcloud.msvc_users.entity.User;

public interface UserRepository extends CrudRepository<User, Long> {

}
