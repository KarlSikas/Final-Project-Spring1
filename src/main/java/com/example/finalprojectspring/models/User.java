package com.example.finalprojectspring.models;

import jakarta.persistence.*;
import lombok.Data;

import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * @author Sergei Oksanen
 * @Date 3/28/2023
 */
@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@Table(name = "users")
public class User extends Auditable<String> implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firsName;
    private String lastName;
    private String username;
    private String password;
    private String address;

    @Enumerated(EnumType.STRING)
    private UserType userType;

    @OneToOne(cascade = CascadeType.MERGE)
    private Branch branch;

    @OneToOne(cascade = CascadeType.MERGE)
    private Authority authority;

    private boolean isActive;
}
