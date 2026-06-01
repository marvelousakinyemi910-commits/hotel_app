package org.example.hotelManagementSystem.controllers;

import lombok.RequiredArgsConstructor;
import org.example.hotelManagementSystem.dtos.requests.LoginRequestDto;
import org.example.hotelManagementSystem.dtos.requests.RegisterGuestRequestDto;
import org.example.hotelManagementSystem.dtos.responses.LoginResponse;
import org.example.hotelManagementSystem.dtos.responses.RegisterGuestResponse;
import org.example.hotelManagementSystem.services.GuestService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/hotel_app/guests")
public class GuestController {
    private final GuestService guestService;
    @PostMapping("/register")
    public RegisterGuestResponse register(@RequestBody RegisterGuestRequestDto request){
        return guestService.register(request);
    }
    @PostMapping("/login")
    public LoginResponse login(@RequestBody LoginRequestDto request){
        return guestService.login(request);
    }
    @GetMapping("/{guestId}")
    public RegisterGuestResponse getGuestById(@PathVariable String guestId){
        return guestService.getGuestById(guestId);
    }

}
