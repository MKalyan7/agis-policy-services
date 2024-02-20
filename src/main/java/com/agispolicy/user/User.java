package com.agispolicy.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document("user")
public class User {

    @Id
    private String userId;
    private String firstName;
    private String lastName;
    private String userName;
    private String email;
    private String roleType;
    private String dateOfBirth;
    private String address;
    private String country;
    private String zipCode;

}
