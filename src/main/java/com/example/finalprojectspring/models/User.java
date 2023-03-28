package com.example.finalprojectspring.models;

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

    @Enumerated(EnumType.STRING)
    private UserType userType;
}
