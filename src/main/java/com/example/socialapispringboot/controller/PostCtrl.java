package com.example.socialapispringboot.controller;

import com.example.socialapispringboot.entity.Post;
import com.example.socialapispringboot.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class PostCtrl {
    @Autowired
    private PostService postService;

    @GetMapping("/posts")
    public List<Post> getPostList(){
        return postService.getAllPost();
    }

    @GetMapping("/post")
    public String hello(){
        return "hello";
    }




}
