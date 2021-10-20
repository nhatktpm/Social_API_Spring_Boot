package com.example.socialapispringboot.controller;

import com.example.socialapispringboot.entity.Like;
import com.example.socialapispringboot.entity.Post;
import com.example.socialapispringboot.service.LikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/v1")
public class LikeCtrl {

    @Autowired
    private LikeService likeService;

//    @PostMapping("/user/{userId}/post/{postId}")
//    public Map< String, Boolean >  likePost(
//            @PathVariable(value = "userId") Integer idUser,
//            @PathVariable(value = "postId") Integer idPost) {
//         this.likeService.likePost(idUser, idPost);
//
//        Map < String, Boolean > response = new HashMap<>();
//        response.put("likePost", Boolean.TRUE);
//        return response;
//    }

    @PostMapping("/user/{userId}/post/{postId}")
    public Map< String, Boolean>  likePost(
            @PathVariable(value = "userId") Integer idUser,
            @PathVariable(value = "postId") Integer idPost) {
        Like like = likeService.likePost(idUser,idPost);

        Map < String, Boolean > response = new HashMap<>();

        response.put("likePost",Boolean.TRUE );
        return response;
    }

    @DeleteMapping("/user/{userId}/post/{postId}")
    public Map< String, Boolean>  unLikePost(
            @PathVariable(value = "userId") Integer idUser,
            @PathVariable(value = "postId") Integer idPost) {
        Like like = likeService.getLikeByUserAndPost(idUser,idPost);
        likeService.unLikePost(idUser,idPost);

        Map < String, Boolean > response = new HashMap<>();

        response.put("unLikePost",Boolean.TRUE );
        return response;
    }


}
