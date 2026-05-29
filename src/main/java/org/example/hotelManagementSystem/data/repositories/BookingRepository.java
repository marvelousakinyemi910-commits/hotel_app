package org.example.hotelManagementSystem.data.repositories;

import org.example.hotelManagementSystem.data.models.Booking;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookingRepository extends MongoRepository<Booking, String> {
}
