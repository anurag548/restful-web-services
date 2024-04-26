package io.delta.restfulwebservices.user;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
    public UserEntity getUserById(@PathVariable("id") String id) {
        final  _userServices.getAllUsers();
    }
}
