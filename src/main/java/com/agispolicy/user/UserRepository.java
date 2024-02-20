package com.agispolicy.user;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.Update;

public interface UserRepository extends MongoRepository<User,String> {
    @Query(value = "{ 'userName' : ?0 }")
    User findUserByUserName(String userName);



}
