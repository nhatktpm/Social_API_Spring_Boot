package com.example.socialapispringboot.service.Impl;

import com.example.socialapispringboot.entity.Post;
import com.example.socialapispringboot.repository.PostRepository;
import com.example.socialapispringboot.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService {

    @Autowired
    private PostRepository postRepository;

    @Override
    public List<Post> getAllPost() {
        return postRepository.findAll();
    }

    @Override
    public Post findPostById(int idPost) {
        return postRepository.getById(idPost);
    }

    @Override
    public void savePost(Post post) {
    this.postRepository.save(post);
    }

    @Override
    public void deletePostById(int id) {
    this.postRepository.deleteById(id);
    }
}
