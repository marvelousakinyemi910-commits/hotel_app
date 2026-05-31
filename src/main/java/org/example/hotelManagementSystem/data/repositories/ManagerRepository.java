package org.example.hotelManagementSystem.data.repositories;

import org.example.hotelManagementSystem.data.models.Manager;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ManagerRepository extends MongoRepository<Manager, String> {
}
