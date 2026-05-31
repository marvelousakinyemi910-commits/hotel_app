package org.example.hotelManagementSystem.dtos.requests;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.hotelManagementSystem.data.models.enums.RoomStatus;
@Data
@NoArgsConstructor
public class ManagerRequestDto {
    private String bookingId;
    private String managerId;
    private Boolean confirmCheckIn;
    private RoomStatus roomStatus;
}
