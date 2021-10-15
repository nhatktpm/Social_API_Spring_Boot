package com.example.socialapispringboot.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "posts")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    private String content;

    @Temporal(TemporalType.DATE)
    private Date create_date;

    @Temporal(TemporalType.DATE)
    private Date update_date;

    @ManyToOne
    @JoinColumn(name = "poster")
    User user;

    @OneToMany(mappedBy = "user")
    List<Like> likes ;

    @OneToMany(mappedBy = "post")
    List<Comment> comments ;
}
