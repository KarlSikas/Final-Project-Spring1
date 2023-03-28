package com.example.finalprojectspring.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

/**
 * @author Sergei Oksanen
 * @ Date 22.03.2023
 */


@Entity
@Data
@EqualsAndHashCode(callSuper = true)
public class Rental  extends Auditable<String> implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @OneToOne(cascade = CascadeType.MERGE)
    private Employee employee;
    public LocalDate dateOfReturn;
    @OneToOne(cascade = CascadeType.MERGE)
    private Booking booking;
    public String comments;

    public boolean isActive;

}
