package org.example.hotelManagementSystem.dtos.responses;

import lombok.Data;
import org.example.hotelManagementSystem.data.models.enums.BookingStatus;
import org.example.hotelManagementSystem.data.models.enums.RoomStatus;
@Data
public class ManagerResponse {
    private String message;
    private String bookingId;
    private RoomStatus roomStatus;
    private BookingStatus bookingStatus;
}
