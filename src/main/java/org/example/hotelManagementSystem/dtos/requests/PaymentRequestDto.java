package org.example.hotelManagementSystem.dtos.requests;

import lombok.Data;
import org.example.hotelManagementSystem.data.models.enums.PaymentType;
@Data
public class PaymentRequestDto {
    private String bookingId;
    private PaymentType paymentType;
    private Double amountPaid;
}
