package com.example.finalprojectspring.exceptions;

/**
 * @author Sergei Oksanen
 * @Date 3/28/2023
 */
public class BranchNotFoundException extends Exception {
    private static final long serialVersionUID = 1L;

    public BranchNotFoundException(String address) {
        super(String.format("Authority not found for name: %s", address));
    }
}
