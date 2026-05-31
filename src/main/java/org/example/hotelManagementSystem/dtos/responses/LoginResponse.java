package org.example.hotelManagementSystem.dtos.responses;

import lombok.Data;

@Data
public class LoginResponse {
    private String guestId;
    private String password;
    private String email;
    private String guestName;

}
