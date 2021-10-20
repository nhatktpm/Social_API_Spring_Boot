package com.example.socialapispringboot.service;

import com.example.socialapispringboot.entity.Like;

import java.util.Optional;

public interface LikeService {
    Like likePost(int idUser, int idPost);
    void  unLikePost(int idUser, int idPost);
   Like getLikeByUserAndPost(int idUser, int idPost);

}
