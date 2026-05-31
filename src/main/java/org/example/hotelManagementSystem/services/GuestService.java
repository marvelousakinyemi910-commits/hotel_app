package org.example.hotelManagementSystem.services;

import org.example.hotelManagementSystem.dtos.requests.LoginRequestDto;
import org.example.hotelManagementSystem.dtos.requests.RegisterGuestRequestDto;
import org.example.hotelManagementSystem.dtos.responses.LoginResponse;
import org.example.hotelManagementSystem.dtos.responses.RegisterGuestResponse;

public interface GuestService {
    RegisterGuestResponse register(RegisterGuestRequestDto register);

    LoginResponse login(LoginRequestDto login);

    RegisterGuestResponse getGuestById(String guestId);
}
