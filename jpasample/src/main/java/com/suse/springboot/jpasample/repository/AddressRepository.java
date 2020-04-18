package com.suse.springboot.jpasample.repository;

import com.suse.springboot.jpasample.entity.Address;
import com.suse.springboot.jpasample.entity.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AddressRepository extends CrudRepository<Address, Integer> {

    Iterable<Address> findByUserId(Integer userId);
}
