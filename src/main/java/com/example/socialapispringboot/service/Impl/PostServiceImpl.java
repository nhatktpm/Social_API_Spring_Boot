package com.example.socialapispringboot.service.Impl;

import com.example.socialapispringboot.entity.Post;
import com.example.socialapispringboot.repository.PostRepository;
import com.example.socialapispringboot.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostServiceImpl implements PostService {

    @Autowired
    private PostRepository postRepository;

    @Override
    public List<Post> getAllPost() {
        return postRepository.findAll();
    }

    @Override
    public Optional<Post> getPostById(int idPost) {
        return postRepository.findById(idPost);
    }

    @Override
    public Post savePost(Post post) {
       return postRepository.save(post);
    }

    @Override
    public void deletePostById(Post post) {
        this.postRepository.delete(post);
    }
}
