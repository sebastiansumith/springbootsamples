package com.suse.springboot.jpasample.entity;

import lombok.Data;

import javax.persistence.*;

@Entity()
@Data()
@Table(name="userprofile")
public class UserProfile {

    @Id()
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @Column(name = "userName")
    private String userName;

    @Column(name = "password")
    private String password;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;
}
