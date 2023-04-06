package com.example.finalprojectspring.services;

import com.example.finalprojectspring.exceptions.CarNotFoundException;
import com.example.finalprojectspring.exceptions.UserNotFoundException;
import com.example.finalprojectspring.models.Car;
import com.example.finalprojectspring.models.User;

import java.util.List;

/**
 * @author Sergei Oksanen
 * @Date 3/28/2023
 */
public interface UserService {
    /**
     * To find all users
     *
     * @return a list of User
     */
    List<User> findAllUsers();

    /**
     * To find user by Username
     *
     * @param username username
     * @return User
     */
    User findUserByUsername(String username) throws UserNotFoundException;

    /**
     * To create a new User
     *
     * @param user User
     */
    void createUser(User user);

    /**
     * To update on existing User
     *
     * @param  user User
     */

    void updateUser(User user) throws CarNotFoundException, UserNotFoundException;
}
