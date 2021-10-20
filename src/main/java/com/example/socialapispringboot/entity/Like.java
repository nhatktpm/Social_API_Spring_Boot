package com.example.socialapispringboot.entity;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "likes")
public class Like {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "state")
    private int state;

    @Column(name = "post_id")
    private int idPost;

    @Column(name = "user_id")
    private int idUser;

    public Like(int state, int idUser, int idPost) {
        this.state = state;
        this.idUser = idUser;
        this.idPost = idPost;

    }
}

