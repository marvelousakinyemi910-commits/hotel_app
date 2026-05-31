package org.example.hotelManagementSystem.dtos.responses;

import lombok.Data;


import java.time.LocalDate;

@Data
public class BookingResponse {
    private String bookingId;
    private LocalDate checkInDate;
    private LocalDate checkOutDate;
    private String bookingStatus;
    private Double bookingPrice;


}
