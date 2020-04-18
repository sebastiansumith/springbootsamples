package com.suse.springboot.jpasample.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.suse.springboot.jpasample.entity.User;
import com.suse.springboot.jpasample.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;

@Service()
@Slf4j
public class UserService {

    @Autowired()
    private UserRepository userRepository;

    public Iterable<User> getUsers(){
        return userRepository.findAll();
    }

    public User createUser(User user){
        log.info("Request received to create user {}",user );
        return userRepository.save(user);
    }

}
