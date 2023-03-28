package com.example.finalprojectspring.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.List;

/**
 * @author Priit Enno
 * @ Date 22.03.2023
 */
@Entity
@Data
@EqualsAndHashCode(callSuper = true)
public class Employee extends Auditable<String> implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    @Enumerated(EnumType.STRING)
    private UserType role;

    @OneToOne(cascade = CascadeType.MERGE)
    private Branch branch;


}
