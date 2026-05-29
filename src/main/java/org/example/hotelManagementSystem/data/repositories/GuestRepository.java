package org.example.hotelManagementSystem.data.repositories;

import org.example.hotelManagementSystem.data.models.Guest;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface GuestRepository extends MongoRepository<Guest, String> {

}
