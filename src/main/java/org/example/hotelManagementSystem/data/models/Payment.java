package org.example.hotelManagementSystem.data.models;

import lombok.Data;
import org.example.hotelManagementSystem.data.models.enums.PaymentStatus;
import org.example.hotelManagementSystem.data.models.enums.PaymentType;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Payment {
    private double amount;
    private PaymentStatus status;
    private PaymentType paymentType;

}
