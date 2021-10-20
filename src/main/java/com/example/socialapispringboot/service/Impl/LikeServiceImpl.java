package com.example.socialapispringboot.service.Impl;

import com.example.socialapispringboot.entity.Like;
import com.example.socialapispringboot.repository.LikeRepository;
import com.example.socialapispringboot.service.LikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LikeServiceImpl implements LikeService {

    @Autowired
    LikeRepository likeRepository;

    @Override
    public Like likePost(int idUser, int idPost) {
      Like like = new Like(1,idUser,idPost);
      this.likeRepository.save(like);
      return like;
    }

    @Override
    public void unLikePost(int idUser, int idPost) {
        Like  like = this.getLikeByUserAndPost(idUser, idPost);
        this.likeRepository.delete(like);
    }

    @Override
    public Like getLikeByUserAndPost(int idUser, int idPost) {
        return likeRepository.getLikeByUserAndPost(idUser, idPost);
    }


}
