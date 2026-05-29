package org.example.hotelManagementSystem.data.repositories;

import org.example.hotelManagementSystem.data.models.Room;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RoomRepository extends MongoRepository<Room, String> {
}
