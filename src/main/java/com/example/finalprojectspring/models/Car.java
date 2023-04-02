package com.example.finalprojectspring.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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

    private String modelName;
    private String color;
    private String bodyType;

    private int yearOfProd;
    private int mileage;
    private int amount;
    private  boolean isBooked;

}
