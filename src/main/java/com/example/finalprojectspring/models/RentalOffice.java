package com.example.finalprojectspring.models;

/**
 * @author Priit Enno
 * @ Date 22.03.2023
 */
public class RentalOffice {

    private String name;
    private String internetDomain;
    private String contactAddress;
    private String owner;

    public RentalOffice(String name, String internetDomain, String contactAddress, String owner) {
        this.name = name;
        this.internetDomain = internetDomain;
        this.contactAddress = contactAddress;
        this.owner = owner;
    }
}
