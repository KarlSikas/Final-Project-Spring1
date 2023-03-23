package com.example.finalprojectspring.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.EqualsAndHashCode;



import java.io.Serializable;

/**
 * @author Priit Enno
 * @ Date 22.03.2023
 */
@Data
@Entity
@EqualsAndHashCode(callSuper = true)
public class Car extends com.sda.study.springbootpractice.models.Auditable<String> implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String modelName;
    private String color;
    private String bodyType;

    private int yearOfProd;
    private int mileage;
    private int amount;
    private  boolean isBooked;


}
