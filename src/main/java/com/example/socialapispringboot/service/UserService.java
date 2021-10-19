package com.example.socialapispringboot.service;

import com.example.socialapispringboot.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    User saveUser(User user);
    List<User> getAllUser();
    Optional<User> getUserById(int idUser);
    User updateUser(User user);

}
