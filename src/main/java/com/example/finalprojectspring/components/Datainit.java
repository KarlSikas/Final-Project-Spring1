package com.example.finalprojectspring.components;

/**
 * @author Sergei Oksanen
 * @Date 3/23/2023
 */


import com.example.finalprojectspring.models.*;
import com.example.finalprojectspring.exceptions.*;
import com.example.finalprojectspring.services.*;

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
        initBranch();
        initCar();
        initCustomer();
        initBooking();
        initAuthority();
       /* initUser();*/
    }


    private  void initBranch(){

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

    private  void initCustomer(){

    }

    private  void initBooking(){

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

   /** private void initUser() {
        System.out.println("Starting initializing User..");

        try {
            Authority authority = authorityService.findAuthorityByName(AUTHORITY_OWNER);

            User user = new User();
            user.setUsername("admin@study.com");
            user.setPassword("123456");
            user.setAuthority(authority);

            try {
                User resultUser = UserService.findUserByUsername(user.getUsername());
                System.out.println("Cannot pre-initialize user: " + user.getUsername());
            } catch(UserNotFoundException e) {
                UserService.createUser(user);
            }
        } catch (AuthorityNotFoundException e) {
            System.out.println("Cannot pre-initialize User! Reason:  " + e.getLocalizedMessage());
        }
    }
*/
    private void createAuthority(Authority authority) {
        try {
            Authority resultAuthority = authorityService.findAuthorityByName(authority.getName());
            System.out.println("Cannot pre-initialize authority: " + authority.getName());
        } catch (AuthorityNotFoundException e) {
            authorityService.createAuthority(authority);
        }
    }


}
