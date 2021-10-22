package com.example.socialapispringboot.controller;

import com.example.socialapispringboot.entity.Post;
import com.example.socialapispringboot.entity.User;
import com.example.socialapispringboot.exception.NotFoundException;
import com.example.socialapispringboot.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1")
public class PostCtrl {
    @Autowired
    private PostService postService;

    @GetMapping("/posts")
    public List<Post> getPostList(){
        return postService.getAllPost();
    }

    @GetMapping(value = "/posts",params = {"page","limit"})
    public List<Post> getPostList(
            @RequestParam("page") int pageNumber,
            @RequestParam("limit") int pageSize
    ){
        return postService.getAllPost(pageNumber,pageSize);
    }

    @GetMapping("/post/{id}")
    public Post getPostById(
            @PathVariable("id") Integer id) {
        return postService.getPostById(id).orElseThrow(() -> new NotFoundException("User not found for this id : " + id));
    }

    @PostMapping("/post")
    public Post createEmployee( @RequestBody Post post) {
        return postService.savePost(post);
    }

    @PutMapping("post/{id}")
    public ResponseEntity<Post> updatePost(
            @PathVariable(value = "id") Integer idPost,
            @RequestBody Post postDetail
    ) {
        Post post = postService.getPostById(idPost).orElseThrow(() -> new NotFoundException("Post not found for this id : " + idPost));;
        post.setContent(postDetail.getContent());

        final Post postUpdate = postService.savePost(post);
        return ResponseEntity.ok(postUpdate);
    }

    @DeleteMapping("/post/{id}")
    public Map< String, Boolean > deletePost(@PathVariable(value = "id") int idPost)
            throws NotFoundException {
       Post post = postService.getPostById(idPost)
                .orElseThrow(() -> new NotFoundException("Post not found for this id :: " + idPost));

        postService.deletePostById(post);
        Map < String, Boolean > response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return response;
    }
    




}
