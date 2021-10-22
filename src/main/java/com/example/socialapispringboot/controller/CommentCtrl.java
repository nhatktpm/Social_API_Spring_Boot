package com.example.socialapispringboot.controller;


import com.example.socialapispringboot.entity.Comment;
import com.example.socialapispringboot.exception.NotFoundException;
import com.example.socialapispringboot.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/v1")
public class CommentCtrl {

    @Autowired
    private CommentService commentService;

    @PutMapping("comment/{id}")
    public ResponseEntity<Comment> updatePost(
            @PathVariable(value = "id") Integer idComment,
            @RequestBody Comment commentDetail
    ) {
        Comment comment = commentService.getCommentById(idComment).orElseThrow(() -> new NotFoundException("Post not found for this id : " + idComment));
        comment.setContent(commentDetail.getContent());

        final Comment commentUpdate = commentService.saveComment(comment);
        return ResponseEntity.ok(commentUpdate);
    }

    @DeleteMapping("/comment/{id}")
    public Map< String, Boolean> unLikePost(
            @PathVariable(value = "id") Integer idComment) {

        commentService.deleteCommentById(idComment);
        Map < String, Boolean > response = new HashMap<>();

        response.put("delete",Boolean.TRUE );
        return response;
    }

}
