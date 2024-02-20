package com.agispolicy.user;

import org.springframework.stereotype.Repository;

public interface CustomUserRepository {

    void updateUser(String userName,User updatedUser);
}
