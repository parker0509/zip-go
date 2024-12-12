package com.house.house.service;

import com.house.house.entity.User;
import com.house.house.repository.UserRepository;
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
/*
    v.0.0.1
    CREATE , READ , UPDATE, DELETED

*/

    //save (저장)
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    //Read ( 읽기 )
    public List<User> readUser(User user) {
        return userRepository.findAll();
    }

    //UPDATA ()
    public User update(User user){

        Optional<User> update = userRepository.findById(user.getId());

        if(update.isPresent()){

            user.setId(user.getId());
            user.setName(user.getName());

            return userRepository.save(user);

        }

        return userRepository.save(user);
    }

    //DELETE (ALL)
    public void deleteUserAll() {
        userRepository.deleteAll();
    }


}
