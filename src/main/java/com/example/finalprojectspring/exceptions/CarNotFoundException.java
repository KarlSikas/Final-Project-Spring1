package com.example.finalprojectspring.exceptions;

/**
 * @author Sergei Oksanen
 * @Date 3/23/2023
 */
public class CarNotFoundException extends Throwable  {
    private static final long serialVersionUID = 1L;

    public CarNotFoundException(Long id) {
        super(String.format("Car not found for id: %d", id));
    }

    public CarNotFoundException(String name) {
        super(String.format("Car not found for name: %s", name));
    }

}