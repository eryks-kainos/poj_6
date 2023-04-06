package com.poj.services;

import com.poj.dtos.UserDTO;

import java.util.ArrayList;
import java.util.List;

public class UsersService {

    private List<UserDTO> usersList = new ArrayList<>();

    public void persistUser(UserDTO user) {
        usersList.add(user);
        System.out.println("Zapisuje usera: " + user);
    }

    public UserDTO getUser(Integer id) {
        for (UserDTO user : usersList) {
            if ( user.getId().equals(id)) {
                System.out.println("Zwracam usera: " + user);
                return user;
            }
        }
        throw new RuntimeException("No user found for id: " + id);
    }

    public List<UserDTO> getAllUsers() {
        return usersList;
    }
}
