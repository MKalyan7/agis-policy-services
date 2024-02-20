package com.agispolicy.user;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class UserController {
    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/policy-api/createUser")
    public void createUsuer(@RequestBody User user) {
        userService.createUser(user);
    }

    @GetMapping("/policy-api/getusers")
    public List<User> getUsers() {
        return userService.getUsers();
    }
    @GetMapping("/policy-api/getUserByUserName")
    public User  getUserByUserName(@RequestParam String userName) {
        return userService.getUserByUserName(userName);
    }

    @PutMapping("/policy-api/updateUser")
    public void updateUser(@RequestParam String userName,@RequestBody User user) {
        userService.updateUser(userName,user);
    }

}
