package com.example.finalprojectspring.models;

import javax.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.time.LocalDate;


/**
 * @author Priit Enno
 * @ Date 22.03.2023
 */
@Entity
@Data
@EqualsAndHashCode(callSuper = true)
public class Return extends Auditable<String> implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public LocalDate dateOfReturn;
    @OneToOne(cascade = CascadeType.MERGE)
    private Booking booking;
    public String additionalPayment;
    public String comments;

}
