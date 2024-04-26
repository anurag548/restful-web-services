package io.delta.restfulwebservices.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServices {

    @Autowired
    private UserRepository userRepository;


    public List<UserEntity> getAllUsers() {
        return userRepository.findAll();
    }
}
