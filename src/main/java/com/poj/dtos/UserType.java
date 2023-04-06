package com.poj.dtos;

public enum UserType {
    REGULAR("Regular"),
    ADMIN("Admin");

    private String label;

    UserType(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return label;
    }
}
