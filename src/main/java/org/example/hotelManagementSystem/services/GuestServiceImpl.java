package org.example.hotelManagementSystem.services;

import org.example.hotelManagementSystem.data.models.Guest;
import org.example.hotelManagementSystem.data.repositories.GuestRepository;
import org.example.hotelManagementSystem.dtos.requests.LoginRequestDto;
import org.example.hotelManagementSystem.dtos.requests.RegisterGuestRequestDto;
import org.example.hotelManagementSystem.dtos.responses.LoginResponse;
import org.example.hotelManagementSystem.dtos.responses.RegisterGuestResponse;
import org.example.hotelManagementSystem.exceptions.EmailAlreadyExistException;
import org.example.hotelManagementSystem.exceptions.GuestNotFoundException;
import org.example.hotelManagementSystem.exceptions.InvalidPasswordException;
import org.example.hotelManagementSystem.utilities.GuestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service @Component
public class GuestServiceImpl implements GuestService {
    @Autowired
    private GuestRepository guestRepository;
    @Autowired
    private GuestMapper guestMapper;

    @Override
    public RegisterGuestResponse register(RegisterGuestRequestDto request) {
        if (guestRepository.findByEmail(request.getEmail()).isPresent()) {
            throw new EmailAlreadyExistException("Email already exist");
        }
        Guest guest = guestMapper.toEntity(request);
        Guest savedGuest = guestRepository.save(guest);
        return guestMapper.toResponse(savedGuest);
    }

    @Override
    public LoginResponse login(LoginRequestDto request) {
        Guest guest = guestRepository.findByEmail(request.getEmail()).orElseThrow(() -> new GuestNotFoundException("Guest not found"));
        if(!guest.getPassword().equals(request.getPassword())){
            throw new InvalidPasswordException("Wrong password");
        }
        return guestMapper.toLogInResponse(guest);
    }

    @Override
    public RegisterGuestResponse getGuestById(String guestId) {
        Guest guest = guestRepository.findById(guestId).orElseThrow(() -> new GuestNotFoundException("Guest not found"));
        return guestMapper.toResponse(guest);
    }


}
