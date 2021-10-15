package com.example.socialapispringboot.service;

import com.example.socialapispringboot.entity.Post;

import java.util.List;

public interface PostService {
    List<Post> getAllPost();
    Post findPostById(int idPost);
    void savePost(Post post);
    void deletePostById(int id);

}
