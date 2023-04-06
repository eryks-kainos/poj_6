package com.poj.dtos;

public class UserDTO {
    private Integer id;
    private String username;
    private String email;
    private UserType userType;

    public UserDTO(Integer id, String username, String email, UserType userType) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.userType = userType;
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

    public UserType getUserType() {
        return userType;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", type='" + userType + '\'' +
                '}';
    }
}
