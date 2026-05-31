package org.example.hotelManagementSystem.dtos.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.hotelManagementSystem.data.models.enums.PaymentStatus;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentResponseDto {
    private String paymentId;
    private Double amount;
    private PaymentStatus paymentStatus;
    private String bookingId;

}
