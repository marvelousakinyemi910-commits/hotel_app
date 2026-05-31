package org.example.hotelManagementSystem.data.repositories;

import org.example.hotelManagementSystem.data.models.Guest;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface GuestRepository extends MongoRepository<Guest, String> {

    Optional<Guest> findByEmail(String email);
}
