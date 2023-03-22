package com.example.finalprojectspring.models;

/**
 * @author Priit Enno
 * @ Date 22.03.2023
 */
public class Branch {

    public String address;   //address with the city
    public String listOfOfficeEmployees;
    public String listOfCurrentlyAvailableCars;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getListOfOfficeEmployees() {
        return listOfOfficeEmployees;
    }

    public void setListOfOfficeEmployees(String listOfOfficeEmployees) {
        this.listOfOfficeEmployees = listOfOfficeEmployees;
    }

    public String getListOfCurrentlyAvailableCars() {
        return listOfCurrentlyAvailableCars;
    }

    public void setListOfCurrentlyAvailableCars(String listOfCurrentlyAvailableCars) {
        this.listOfCurrentlyAvailableCars = listOfCurrentlyAvailableCars;
    }
}
