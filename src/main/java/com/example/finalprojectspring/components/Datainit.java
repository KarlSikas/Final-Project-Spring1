package com.example.finalprojectspring.components;

/**
 * @author Sergei Oksanen
 * @Date 3/23/2023
 */

import com.example.finalprojectspring.exceptions.AuthorityNotFoundException;
import com.example.finalprojectspring.exceptions.CarNotFoundException;
import com.example.finalprojectspring.models.Authority;
import com.example.finalprojectspring.models.Branch;
import com.example.finalprojectspring.models.Car;
import com.example.finalprojectspring.services.AuthorityService;
import com.example.finalprojectspring.services.CarService;
import com.example.finalprojectspring.services.BranchService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Collections;

import static com.example.finalprojectspring.utils.Constants.Security.*;

@Component
public class Datainit {

    @Autowired
    private CarService carService;
   @Autowired
    private AuthorityService authorityService;


    @PostConstruct
    public void init() {
        initCar();
        initAuthority();

    }
    private void initCar() {
        System.out.println("Starting cars initialization...");

        Car car = new Car();
        car.setModelName("Ford");
        car.setColor("black");
        car.setBodyType("sedan");
        car.setYearOfProd(2023);
        car.setMileage(15000);
        car.setAmount(2);
        car.setBooked(false);

        try {
            Car searchCar = carService.findCarByModelName(car.getModelName());
            System.out.println("Cannot pre-initialize car: " + car.getModelName());
        } catch (CarNotFoundException e) {
            carService.addCar(car);
        }
    }
    private void initAuthority() {
        System.out.println("Starting initializing Authority..");
        Authority authorityAdmin = new Authority();
        authorityAdmin.setName(AUTHORITY_OWNER);
        createAuthority(authorityAdmin);

        Authority authorityTeacher = new Authority();
        authorityTeacher.setName(AUTHORITY_EMPLOYEE);
        createAuthority(authorityTeacher);

        Authority authorityStudent = new Authority();
        authorityStudent.setName(AUTHORITY_CUSTOMER);
        createAuthority(authorityStudent);
    }
    private void createAuthority(Authority authority) {
        try {
            Authority resultAuthority = authorityService.findAuthorityByName(authority.getName());
            System.out.println("Cannot pre-initialize authority: " + authority.getName());
        } catch (AuthorityNotFoundException e) {
            authorityService.createAuthority(authority);
        }
    }

}
