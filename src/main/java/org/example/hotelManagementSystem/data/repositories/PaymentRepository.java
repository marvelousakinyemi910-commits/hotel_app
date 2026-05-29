package org.example.hotelManagementSystem.data.repositories;


import org.example.hotelManagementSystem.data.models.Payment;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PaymentRepository extends MongoRepository<Payment, String> {
}
