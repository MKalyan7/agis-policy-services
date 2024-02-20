package com.agispolicy.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
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
