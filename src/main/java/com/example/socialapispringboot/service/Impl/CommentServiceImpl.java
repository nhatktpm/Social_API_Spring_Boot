package com.example.socialapispringboot.service.Impl;

import com.example.socialapispringboot.entity.Comment;
import com.example.socialapispringboot.repository.CommentRepository;
import com.example.socialapispringboot.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {
    @Autowired
    CommentRepository commentRepository;

    @Override
    public List<Comment> getAllCommentByPost(int idPost) {
        return null;
    }

    @Override
    public boolean isCommentOfUser(int idComment, int IdUser) {
        return false;
    }

    @Override
    public Comment saveComment(Comment comment) {
        return commentRepository.save(comment);
    }

    @Override
    public void deleteCommentById(int id) {
        Comment comment = commentRepository.getById(id);
        commentRepository.delete(comment);
    }
}
