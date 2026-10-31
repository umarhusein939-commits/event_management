package com.event.management.model.entity;

import java.time.LocalDateTime;

public class User {
    private Long id;
    private String fullName;
    private String email;
    private String password;
    private Role role;
    private LocalDateTime createdAt;
}
