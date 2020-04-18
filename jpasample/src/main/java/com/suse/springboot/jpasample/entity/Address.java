package com.suse.springboot.jpasample.entity;

import lombok.Data;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

@Entity()
@Data()
@Table(name= "address")
public class Address {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @Column(name = "address")
    private String address;

    @Column(name="zipCode")
    private String zipCode;

    @Column(name="type")
    private String type;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "user_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private User user;
}
