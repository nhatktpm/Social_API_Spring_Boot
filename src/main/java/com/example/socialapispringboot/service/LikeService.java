package com.example.socialapispringboot.service;

import com.example.socialapispringboot.entity.Like;

public interface LikeService {
    void likePost(int idUser, int idPost);
    boolean isLikePost(int idUser, int idPost);
    void  unLikePost(int idUser, int idPost);
    int countLikePost(int idPost);
}
