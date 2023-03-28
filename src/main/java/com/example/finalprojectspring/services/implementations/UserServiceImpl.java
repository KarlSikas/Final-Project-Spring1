package com.example.finalprojectspring.services.implementations;

import com.example.finalprojectspring.exceptions.UserNotFoundException;
import com.example.finalprojectspring.models.User;
import com.example.finalprojectspring.services.UserService;

import java.util.List;

/**
 * @author Sergei Oksanen
 * @Date 3/28/2023
 */
public class UserServiceImpl implements UserService {
    @Override
    public List<User> findAllUsers() {
        return null;
    }

    @Override
    public User findUserByUsername(String username) throws UserNotFoundException {
        return null;
    }

    @Override
    public void createUser(User user) {

    }
}
