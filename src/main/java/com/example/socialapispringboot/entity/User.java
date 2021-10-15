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
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "email")
    private String email;

    @Column(name = "fullname")
    private String password;

    @Column(name = "avatar")
    private String avatar;

    @Temporal(TemporalType.DATE)
    private Date create_date;

    @Temporal(TemporalType.DATE)
    private Date update_date;

    @OneToMany(mappedBy = "user")
    List<Like> likes ;

    @OneToMany(mappedBy = "user")
    List<Comment> comments ;

    @OneToMany(mappedBy = "user")
    List<Post> posts ;


}
