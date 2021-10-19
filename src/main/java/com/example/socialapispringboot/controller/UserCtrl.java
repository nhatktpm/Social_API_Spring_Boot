package com.example.socialapispringboot.controller;

import com.example.socialapispringboot.entity.User;
import com.example.socialapispringboot.exception.NotFoundException;
import com.example.socialapispringboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
public class UserCtrl {

    @Autowired
    UserService userService;

    @GetMapping("/users")
    public List<User> getAllUser() {
        return userService.getAllUser();
    }

    @GetMapping("user/{id}")
    public User getUserById(
            @PathVariable("id") Integer id) {
        return userService.getUserById(id).orElseThrow(() -> new NotFoundException("User not found for this id : " + id));
    }

    @PutMapping("user/{id}")
    public ResponseEntity<User> updateUser(
            @PathVariable(value = "id") Integer idUser,
            @RequestBody User userDetail
    ) {
        User user = userService.getUserById(idUser).orElseThrow(() -> new NotFoundException("User not found for this id : " + idUser));;
        user.setAvatar(userDetail.getAvatar());
        user.setFullName(userDetail.getFullName());
        user.setPassword(userDetail.getPassword());

        final User userUpdate = userService.saveUser(user);
        return ResponseEntity.ok(userUpdate);
    }


}
