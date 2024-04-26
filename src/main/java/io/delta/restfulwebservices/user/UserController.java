package io.delta.restfulwebservices.user;


import io.delta.restfulwebservices.user.exceptions.UserNotFoundException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.function.Predicate;

@RestController
public class UserController {

    private final UserServices _userServices;

    public UserController(UserServices userServices) {
        this._userServices = userServices;
    }

    @GetMapping(path = "/users")
    public List<UserEntity> getAllUsers() {
       return _userServices.getAllUsers();
    }

    @GetMapping(path = "/users/{id}")
    public UserEntity getUserById(@PathVariable("id") long id) {
        final UserEntity user =  _userServices.findOne(id);

        if(user == null) {
            throw new UserNotFoundException("User with id " + id + " not found");
        }

        return user;
    }
}
