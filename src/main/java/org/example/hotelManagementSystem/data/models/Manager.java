package org.example.hotelManagementSystem.data.models;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
public class Manager {
    private String firstName;
    private String lastName;
    private String email;
}
