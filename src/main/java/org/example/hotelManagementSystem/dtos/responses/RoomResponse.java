package org.example.hotelManagementSystem.dtos.responses;

import lombok.Data;
import org.example.hotelManagementSystem.data.models.Room;
@Data
public class RoomResponse {
    private String roomNumber;
    private Double price;
}
