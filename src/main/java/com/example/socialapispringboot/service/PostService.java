package com.example.socialapispringboot.service;

import com.example.socialapispringboot.entity.Post;

import java.util.List;
import java.util.Optional;

public interface PostService {
    List<Post> getAllPost();
    Optional<Post> getPostById(int idPost);
    Post savePost(Post post);
    void deletePostById(Post post);

}
