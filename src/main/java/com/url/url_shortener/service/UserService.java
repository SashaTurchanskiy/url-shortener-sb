package com.url.url_shortener.service;

import com.url.url_shortener.dtos.LoginRequest;
import com.url.url_shortener.models.User;
import com.url.url_shortener.security.jwt.JwtAuthenticationResponse;

public interface UserService {
    User registerUser(User user);
    JwtAuthenticationResponse authenticationUser(LoginRequest request);
}
