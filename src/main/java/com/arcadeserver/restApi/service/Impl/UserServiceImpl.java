package com.arcadeserver.restApi.service.Impl;

import com.arcadeserver.restApi.entitites.User;
import com.arcadeserver.restApi.repository.UserRepository;
import com.arcadeserver.restApi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User findByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    @Override
    public User saveOrUpdateUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public void deleteUserById(String id) {
        userRepository.deleteById(id);
    }


}
