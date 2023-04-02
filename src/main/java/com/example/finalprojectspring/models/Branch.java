package com.example.finalprojectspring.models;

import javax.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.List;

/**
 * @author Sergei Oksanen
 * @ Date 22.03.2023
 */
@Data
@Entity
@EqualsAndHashCode(callSuper = true)
public class Branch extends Auditable<String> implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public String address;   //address with the city

    @OneToMany(cascade = CascadeType.MERGE)
    private List<Car> specializedCars;

}
