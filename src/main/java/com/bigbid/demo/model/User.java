package com.bigbid.demo.model;

public class User {
    private Long userId;
    private String username;
    private String password;
    private Role role;

    public enum Role {
        ADMIN,
        USER;
    }
}