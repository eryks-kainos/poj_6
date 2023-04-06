package com.poj.xbak;

import org.springframework.web.bind.annotation.*;

import java.util.List;

public class SthElse {

    @GetMapping("/poj")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @GetMapping("/poj/user")
    public UserDTO getUser(@RequestParam Integer id) {
        return new UserDTO(id, "gosc", "gosc@mail.com", UserType.EMPLOYEE);
    }

    @GetMapping("/poj/allUsers")
    public List<UserDTO> getAllUsers() {
        return List.of(new UserDTO(1, "gosc", "gosc@mail.com", UserType.EMPLOYEE),
                new UserDTO(2, "gosc2", "gosc@mail.com", UserType.ADMIN));
    }

    @PutMapping("/poj/user")
    public void getUser(@RequestBody UserDTO user) {
        System.out.println("Saved user " + user);
    }

    class UserDTO {
        private Integer id;
        private String username;
        private String email;
        private UserType type;

        public UserDTO(Integer id, String username, String email, UserType type) {
            this.id = id;
            this.username = username;
            this.email = email;
            this.type = type;
        }

        public Integer getId() {
            return id;
        }

        public String getUsername() {
            return username;
        }

        public String getEmail() {
            return email;
        }

        public UserType getType() {
            return type;
        }

        @Override
        public String toString() {
            return "UserDTO{" +
                    "id=" + id +
                    ", username='" + username + '\'' +
                    ", email='" + email + '\'' +
                    ", type=" + type +
                    '}';
        }
    }

    enum UserType {
        EMPLOYEE,
        ADMIN
    }
}
