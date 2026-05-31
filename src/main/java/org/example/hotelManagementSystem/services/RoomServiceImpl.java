package org.example.hotelManagementSystem.services;

import org.example.hotelManagementSystem.data.models.Room;
import org.example.hotelManagementSystem.data.repositories.RoomRepository;
import org.example.hotelManagementSystem.dtos.requests.RoomRequestDto;
import org.example.hotelManagementSystem.dtos.responses.RoomResponse;
import org.example.hotelManagementSystem.exceptions.RoomNotFoundException;
import org.example.hotelManagementSystem.utilities.RoomMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component
public class RoomServiceImpl implements RoomService{
    @Autowired
    private RoomRepository roomRepository;
    @Autowired
    private RoomMapper roomMapper;
    @Override
    public RoomResponse createRoom(RoomRequestDto request) {
        Room room = roomMapper.toEntity(request);
       Room savedRoom =  roomRepository.save(room);

        return roomMapper.toResponse(savedRoom);
    }

    @Override
    public RoomResponse getRoomById(String roomId) {
        Room room = roomRepository.findById(roomId).orElseThrow(() -> new RoomNotFoundException("Room Not Found"));
        return roomMapper.toResponse(room);
    }



    @Override
    public void deleteRoomById(String roomId) {
    Room room = roomRepository.findById(roomId).orElseThrow(() -> new RoomNotFoundException("Room Not Found"));
   roomRepository.delete(room);
    }
}
