package org.example.hotelManagementSystem.utilities;

import org.example.hotelManagementSystem.data.models.Room;
import org.example.hotelManagementSystem.dtos.requests.RoomRequestDto;
import org.example.hotelManagementSystem.dtos.responses.RoomResponse;
import org.springframework.stereotype.Component;

@Component
public class RoomMapper {
    public Room toEntity(RoomRequestDto request){
        Room room = new Room();
        room.setRoomNumber(request.getRoomNumber());
        room.setRoomtype(request.getRoomType());
        return room;
    }

    public RoomResponse toResponse(Room room){
        RoomResponse response = new RoomResponse();
        response.setRoomNumber(room.getRoomNumber());
        response.setPrice(room.getPrice());

        return response;
    }
}
