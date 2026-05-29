package org.example.hotelManagementSystem.data.models;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Guest {
    private String name;
    private String email;
    private String phone;
    private String id;
}

