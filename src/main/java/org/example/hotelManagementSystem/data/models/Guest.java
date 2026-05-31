package org.example.hotelManagementSystem.data.models;

import lombok.Data;
import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Guest {
    @Id
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String id;
    @Getter
    private String password;
}

