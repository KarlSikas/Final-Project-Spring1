package com.example.finalprojectspring.models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.OneToOne;
import lombok.Data;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

/**
 * @author Sergei Oksanen
 * @Date 3/28/2023
 */
@Data
public class User {
    private String firsName;
    private String lastName;
    private String password;
    private String address;

    @Enumerated(EnumType.STRING)
    private UserType userType;

    @OneToOne(cascade = CascadeType.MERGE)
    private Branch branch;

}
