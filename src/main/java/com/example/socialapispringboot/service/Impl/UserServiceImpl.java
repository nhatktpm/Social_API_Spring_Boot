package com.example.socialapispringboot.service.Impl;

import com.example.socialapispringboot.entity.User;
import com.example.socialapispringboot.repository.UserRepository;
import com.example.socialapispringboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public Optional<User> getUserById(int idUser) {
        return userRepository.findById(idUser);
    }

    @Override
    public User updateUser(User user) {
        return userRepository.save(user);
    }
}
