package org.example.hotelManagementSystem.dtos.requests;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Data
@NoArgsConstructor
public class UpdateBookingRequestDto {
    private LocalDate checkInDate;
    private LocalDate checkOutDate;
    private int numberOfGuests;

}
