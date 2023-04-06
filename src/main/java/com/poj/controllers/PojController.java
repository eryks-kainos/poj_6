package com.poj.controllers;

import com.poj.dtos.AdminDTO;
import com.poj.dtos.UserDTO;
import com.poj.services.UsersService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PojController {

    private final UsersService usersService;

    public PojController() {
        this.usersService = new UsersService();
    }

    @GetMapping("/poj")
    public String greeting() {
        return "Greetings from Spring Boot!";
    }

    @GetMapping("/poj/user")
    public UserDTO getUser(@RequestParam Integer id) {
        return usersService.getUser(id);
    }

    @PutMapping("/poj/user")
    public void putUser(@RequestBody UserDTO user) {
        usersService.persistUser(user);
    }

    @PutMapping("/poj/admin")
    public void putUser(@RequestBody AdminDTO admin) {
        usersService.persistUser(admin);
    }

    @GetMapping("/poj/users")
    public List<UserDTO> getAllUsers() {
        return usersService.getAllUsers();
    }
}
