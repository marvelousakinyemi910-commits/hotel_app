package org.example.hotelManagementSystem.services;

import org.example.hotelManagementSystem.dtos.requests.PaymentRequestDto;
import org.example.hotelManagementSystem.dtos.responses.PaymentResponseDto;

public interface PaymentService {
    PaymentResponseDto makePayment(PaymentRequestDto request);
    PaymentResponseDto getPayment_byBookingId(String bookingId);
}
