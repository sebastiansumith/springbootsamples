package com.suse.springboot.jpasample.repository;

import com.suse.springboot.jpasample.entity.UserProfile;
import org.springframework.data.repository.CrudRepository;

public interface UserProfileRepsitory extends CrudRepository<UserProfile, Integer> {
}
