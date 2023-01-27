package com.waa.labtwo.service;

import com.waa.labtwo.entity.dto.request.LoginRequest;
import com.waa.labtwo.entity.dto.request.RefreshTokenRequest;
import com.waa.labtwo.entity.dto.response.LoginResponse;

public interface AuthService {
    LoginResponse login(LoginRequest loginRequest);
    LoginResponse refreshToken(RefreshTokenRequest refreshTokenRequest);
}
