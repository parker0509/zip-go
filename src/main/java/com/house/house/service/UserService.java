package com.house.house.service;

import com.house.house.entity.User;
import com.house.house.repository.UserRepository;
import jakarta.validation.constraints.AssertFalse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {


    private UserRepository userRepository;


    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    //save (저장)
    public User saveUser(User user ) {return userRepository.save(user);}
    //Read ( 읽기 )
    public List<User> readUser(User user) {
        return userRepository.findAll();
    }




}
