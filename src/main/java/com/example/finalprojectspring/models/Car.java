package com.example.finalprojectspring.models;

import javax.persistence.*;

import lombok.Data;



import java.awt.*;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.io.Serializable;

/**
 * @author Sergei Oksanen
 * @ Date 22.03.2023
 */
@Data
@Entity

public class Car implements Serializable {
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
