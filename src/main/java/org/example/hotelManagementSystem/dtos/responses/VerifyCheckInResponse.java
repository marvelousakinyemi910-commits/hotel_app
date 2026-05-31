package org.example.hotelManagementSystem.dtos.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VerifyCheckInResponse {
     private String GuestName;
     private String bookingId;
     private String roomNumber;
     private String roomStatus;

}
