package com.example.socialapispringboot.repository;

import com.example.socialapispringboot.entity.Like;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LikeRepository extends JpaRepository<Like, Integer> {

    @Query("Select l From Like l Where l.idUser=:idUser and l.idPost=:idPost")
    Like getLikeByUserAndPost(@Param("idUser") int idUser, @Param("idPost") int idPost);

//    @Modifying
//    @Query("update Like l set l.state = 1 where l.idUser= :idUser and l.idPost=:idPost ")
//    void likePostByUser(@Param("idUser") int idUser, @Param("idPost") int idPost);

    @Modifying
    @Query("update Like l set l.state = 0 where l.idUser= :idUser and l.idPost=:idPost ")
    void unLikePostByUser(@Param("idUser") int idUser, @Param("idPost") int idPost);

    @Modifying
    @Query("delete from Like l where  l.idUser= :idUser and l.idPost=:idPost")
    void deleteLike(@Param("idUser") int idUser, @Param("idPost") int idPost);

}
