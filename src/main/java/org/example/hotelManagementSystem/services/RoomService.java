package org.example.hotelManagementSystem.services;

import org.example.hotelManagementSystem.dtos.requests.RoomRequestDto;
import org.example.hotelManagementSystem.dtos.responses.RoomResponse;

import java.util.List;

public interface RoomService {
RoomResponse createRoom(RoomRequestDto request);
RoomResponse getRoomById(String roomId);

void deleteRoomById(String roomId);

}
