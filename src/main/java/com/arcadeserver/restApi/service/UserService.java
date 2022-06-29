package com.arcadeserver.restApi.service;

import com.arcadeserver.restApi.entitites.User;

import java.util.List;

public interface UserService {

    List<User> findAll();

    User findByEmail(String email);

    User saveOrUpdateUser(User user);

    void deleteUserById(String id);



}
