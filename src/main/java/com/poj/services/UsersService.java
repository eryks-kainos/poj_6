package com.poj.services;

import com.poj.dtos.UserDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
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
        return null;
    }

    public List<UserDTO> getAllUsers() {
        System.out.println("wolam o wszystkich userow");
        return usersList;
    }

    public void deleteUser(Integer id) {
        UserDTO userToDelete = null;
        for (UserDTO user : usersList) {
            if (user.getId().equals(id)) {
                System.out.println("Usuwam usera: " + user);
                userToDelete = user;
            }
        }
        if (userToDelete != null) {
            usersList.remove(userToDelete);
        }
    }
}
