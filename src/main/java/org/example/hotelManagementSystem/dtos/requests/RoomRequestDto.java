package org.example.hotelManagementSystem.dtos.requests;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.hotelManagementSystem.data.models.enums.RoomType;
@Data
@NoArgsConstructor
public class RoomRequestDto {
    private String RoomNumber;
    private RoomType roomType;
}
