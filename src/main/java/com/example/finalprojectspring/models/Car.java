package com.example.finalprojectspring.models;

import javax.persistence.*;

import lombok.Data;
import lombok.EqualsAndHashCode;



import java.io.Serializable;

/**
 * @author Sergei Oksanen
 * @ Date 22.03.2023
 */
@Data
@Entity
@EqualsAndHashCode(callSuper = true)
public class Car extends Auditable<String> implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "MODEL",nullable = false)
    private String modelName;
    @Column (name = "COLOR", nullable = false)
    private String color;
    @Column (name = "BODY_TYPE", nullable = false)
    private String bodyType;
    @Column(name = "YEAR_OF_MANUFACTURE", nullable = false)
    private int yearOfProd;
    @Column(name = "MILEAGE", nullable = false)
    private int mileage;
    @Column(name = "AMOUNT", nullable = false)
    private int amount;
    @Column(name = "STATUS", nullable = false)
    private  boolean isBooked;

}
