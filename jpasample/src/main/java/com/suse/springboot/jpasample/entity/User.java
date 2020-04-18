package com.suse.springboot.jpasample.entity;

import javax.persistence.*;

import lombok.Data;

@Entity()
@Data()
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

}
