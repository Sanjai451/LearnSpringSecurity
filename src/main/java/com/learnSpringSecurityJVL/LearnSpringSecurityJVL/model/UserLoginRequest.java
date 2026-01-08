package com.learnSpringSecurityJVL.LearnSpringSecurityJVL.model;

import lombok.Data;

@Data
public class UserLoginRequest {
    String username;
    String password;
}
