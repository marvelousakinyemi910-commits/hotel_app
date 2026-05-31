package org.example.hotelManagementSystem.data.models;

import lombok.Data;
import org.example.hotelManagementSystem.data.models.enums.RoomStatus;
import org.example.hotelManagementSystem.data.models.enums.RoomType;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Room {
    private String roomNumber;
    private RoomType roomtype;
    private double price;
    private boolean isAvailabe;
    private RoomStatus roomStatus;
}
