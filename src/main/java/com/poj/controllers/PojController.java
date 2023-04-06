package com.poj.controllers;

import com.poj.dtos.AdminDTO;
import com.poj.dtos.UserDTO;
import com.poj.services.UsersService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    /**
     * Dlaczego responseEntity zamiast po prostu UserDTO?
     * Response entity pozwala zwrocic inny kod odpowiedzi:
     * - 200 (OK) oraz zawartosc gdy udalo sie znalezc obiekt
     * - 400 (Bad Request) gdy takiego usera nie ma
     */
    public ResponseEntity<UserDTO> getUser(@RequestParam Integer id) {
        UserDTO user = usersService.getUser(id);
        if (user != null) {
            return ResponseEntity.ok(user);
        }
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
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
