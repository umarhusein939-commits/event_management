package com.event.management.service.interfaces;
import com.event.management.model.entity.dto.AuthResponse;
import com.event.management.model.entity.dto.LoginRequest;
import com.event.management.model.entity.dto.RegisterRequest;
public interface AuthService {
    String register(RegisterRequest registerRequest);

    String verifyOtp(String email, String code);

    AuthResponse login(LoginRequest loginRequest);

}
