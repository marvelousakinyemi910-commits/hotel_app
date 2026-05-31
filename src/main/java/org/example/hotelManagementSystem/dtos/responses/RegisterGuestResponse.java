package org.example.hotelManagementSystem.dtos.responses;

import lombok.Data;

@Data
public class RegisterGuestResponse {
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String id;
}
