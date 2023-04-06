package com.poj.dtos;

public class AdminDTO extends UserDTO {

    private String password;

    public AdminDTO(Integer id, String username, String email, UserType userType, String password) {
        super(id, username, email, userType);
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        String labelUsera = super.toString();
        return labelUsera + "password: " + password;
    }
}
