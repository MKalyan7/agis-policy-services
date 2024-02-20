package com.agispolicy.user;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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

}
