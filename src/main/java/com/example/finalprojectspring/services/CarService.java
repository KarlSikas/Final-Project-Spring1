package com.example.finalprojectspring.services;

import com.example.finalprojectspring.exceptions.CarNotFoundException;
import com.example.finalprojectspring.models.Car;

import java.util.List;

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


    /**
     * To update on existing Car
     *
     * @param  car Car
     */
    void updateCar(Car car) throws CarNotFoundException;

    /**
     * To find all cars
     *
     * @return a list of Cars
     */
    List<Car> findAllCars();

}
