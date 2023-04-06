package com.poj.dtos;

public class AdminDTO extends UserDTO {

    private String password;

    public AdminDTO(Integer id, String username, String email, String password) {
        super(id, username, email);
        this.password = password;
        this.userType = UserType.ADMIN;
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
