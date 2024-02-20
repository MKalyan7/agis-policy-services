package com.agispolicy.user;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private UserRepository userRepository;
    private CustomUserRepository customUserRepository;
    @Autowired
    public UserService(UserRepository userRepository,CustomUserRepository customUserRepository) {
        this.userRepository = userRepository;
        this.customUserRepository = customUserRepository;
    }
    public void createUser(User user) {
        userRepository.save(user);
    }

    public List<User> getUsers() {
        return userRepository.findAll();
    }
    
    public User getUserByUserName(String userName) {
        return userRepository.findUserByUserName(userName);
    }

    public void updateUser(String userName,User updatedUser) {
        customUserRepository.updateUser(userName,updatedUser);
    }

}
