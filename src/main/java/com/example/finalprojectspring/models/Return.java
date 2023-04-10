package com.example.finalprojectspring.models;

import javax.persistence.*;
import lombok.Data;

import java.io.Serializable;

/**
 * @author Sergei Oksanen
 * @ Date 22.03.2023
 */

@Entity
@Data
public class Return extends Rental implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne(cascade = CascadeType.MERGE)
    private Booking booking;

    public String commentsAfter;

}
