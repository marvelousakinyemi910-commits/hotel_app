package org.example.hotelManagementSystem.controllers;

import lombok.RequiredArgsConstructor;
import org.example.hotelManagementSystem.services.GuestService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping
public class GuestController {
    private final GuestService guestService;

}
