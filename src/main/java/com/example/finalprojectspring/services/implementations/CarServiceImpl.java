package com.example.finalprojectspring.services.implementations;

import com.example.finalprojectspring.exceptions.CarNotFoundException;
import com.example.finalprojectspring.models.Car;
import com.example.finalprojectspring.services.CarService;

/**
 * @author Sergei Oksanen
 * @Date 3/23/2023
 */
public class CarServiceImpl implements CarService {
    @Override
    public void addCar(Car car) {

    }

    @Override
    public Car findCarByModelName(String modelName) throws CarNotFoundException {
        return null;
    }
}
