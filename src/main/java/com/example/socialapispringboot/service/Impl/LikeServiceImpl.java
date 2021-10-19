package com.example.socialapispringboot.service.Impl;

import com.example.socialapispringboot.repository.LikeRepository;
import com.example.socialapispringboot.service.LikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LikeServiceImpl implements LikeService {

    @Autowired
    LikeRepository likeRepository;

    @Override
    public void likePost(int idUser, int idPost) {

    }

    @Override
    public boolean isLikePost(int idUser, int idPost) {
        return false;
    }

    @Override
    public void unLikePost(int idUser, int idPost) {

    }

    @Override
    public int countLikePost(int idPost) {
        return 0;
    }
}
