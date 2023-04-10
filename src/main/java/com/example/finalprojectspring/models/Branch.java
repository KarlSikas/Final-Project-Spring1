package com.example.finalprojectspring.models;

import javax.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.List;

/**
 * @author Karl-Erik Sirkas
 * @ Date 22.03.2023
 */
@Data
@Entity

public class Branch  implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private  String address;   //address with the city

    private boolean isActive;

}
