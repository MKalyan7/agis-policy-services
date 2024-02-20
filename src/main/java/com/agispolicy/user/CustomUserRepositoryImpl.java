package com.agispolicy.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Component;

@Component
public class CustomUserRepositoryImpl implements CustomUserRepository{

    @Autowired
    MongoTemplate mongoTemplate;


    @Override
    public void updateUser(String userName, User updatedUser) {

        Query query = new Query(Criteria.where("userName").is(userName));
        Update update = new Update();
        update.set("firstName",updatedUser.getFirstName());
        update.set("lastName",updatedUser.getLastName());
        update.set("email",updatedUser.getEmail());
        update.set("roleType",updatedUser.getRoleType());
        update.set("dateOfBirth",updatedUser.getDateOfBirth());
        update.set("address",updatedUser.getAddress());
        update.set("country",updatedUser.getCountry());
        update.set("zipcode",updatedUser.getZipCode());

        mongoTemplate.updateFirst(query,update,User.class);

    }
}
