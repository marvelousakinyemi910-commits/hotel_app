package org.example.hotelManagementSystem.dtos.requests;

import lombok.Data;

@Data
public class RegisterGuestRequest {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String phoneNumber;
}
