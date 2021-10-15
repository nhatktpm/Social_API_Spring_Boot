package com.example.socialapispringboot.service;

import com.example.socialapispringboot.entity.User;

import java.util.List;

public interface UserService {
    List<User> getAllUser();
    User getUserById(int idUser);
    void updateUser(User user);
}
