package com.example.finalprojectspring.services;

import com.example.finalprojectspring.exceptions.CarNotFoundException;
import com.example.finalprojectspring.models.Car;

/**
 * @author Priit Enno
 * @ Date 22.03.2023
 */
public interface CarService {
    /**
     * To create a new car
     *
     * @param car Car
     */
    void addCar(Car car);

    /**
     * To find a car by modelName
     *
     * @param modelName car modelName
     * @return Car
     */
    Car findCarByModelName(String modelName) throws CarNotFoundException;

}
