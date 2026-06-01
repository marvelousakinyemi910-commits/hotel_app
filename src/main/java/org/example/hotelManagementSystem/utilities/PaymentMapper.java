package org.example.hotelManagementSystem.utilities;

import org.example.hotelManagementSystem.data.models.Payment;
import org.example.hotelManagementSystem.dtos.requests.PaymentRequestDto;
import org.springframework.stereotype.Component;

@Component
public class PaymentMapper {
    public Payment toEntity(PaymentRequestDto request) {
        Payment payment = new Payment();
        payment.setPaymentType(request.getPaymentType());
        payment.setAmount(request.getAmountPaid());
        return payment;
    }

    public PaymentRequestDto toDto(Payment payment) {
        PaymentRequestDto paymentRequestDto = new PaymentRequestDto();
        paymentRequestDto.setPaymentType(payment.getPaymentType());
        paymentRequestDto.setAmountPaid(payment.getAmount());
        return paymentRequestDto;
    }
}
