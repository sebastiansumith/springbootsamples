package com.suse.springboot.jpasample.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import com.suse.springboot.jpasample.entity.User;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;


public interface UserRepository extends CrudRepository<User, Integer>, PagingAndSortingRepository<User, Integer>{

    Page<User> findAll(Pageable pageable);

    List<User> findTop3ByOrderById();
}
