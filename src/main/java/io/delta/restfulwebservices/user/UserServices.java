package io.delta.restfulwebservices.user;

import io.delta.restfulwebservices.user.exceptions.UserNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.function.*;
import java.util.List;
//import java.util.function.Predicate;

@Service
public class UserServices {

    @Autowired
    private UserRepository userRepository;


    public List<UserEntity> getAllUsers() {
        return userRepository.findAll();
    }

    public UserEntity findOne(Long id) {
        final List<UserEntity> users =  getAllUsers();

        Predicate<? super UserEntity> predicate = userEntity -> userEntity.getId().equals(id);

        return users.stream().filter(predicate).findFirst().orElse(null);
    }
}
