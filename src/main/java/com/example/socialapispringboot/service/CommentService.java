package com.example.socialapispringboot.service;

import com.example.socialapispringboot.entity.Comment;

import java.util.List;

public interface CommentService {
    List<Comment> getAllCommentByPost(int idPost);
    boolean isCommentOfUser(int idComment, int IdUser);
    void saveComment(Comment comment);
    void deleteCommentById(int id);
}
