package com.example.socialapispringboot.service;

import com.example.socialapispringboot.entity.Comment;
import com.example.socialapispringboot.entity.Post;

import java.util.List;
import java.util.Optional;

public interface CommentService {
    List<Comment> getAllCommentByPost(int idPost);
    boolean isCommentOfUser(int idComment, int IdUser);
    Comment saveComment(Comment comment);
    void deleteCommentById(int id);
    Optional<Comment> getCommentById(int idComment);
}
