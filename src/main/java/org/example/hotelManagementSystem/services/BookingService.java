package org.example.hotelManagementSystem.services;

import org.example.hotelManagementSystem.dtos.requests.BookingRequestDto;
import org.example.hotelManagementSystem.dtos.requests.VerifyCheckinRequestDTO;
import org.example.hotelManagementSystem.dtos.responses.BookingResponse;

import java.util.List;

public interface BookingService {
    BookingResponse createBooking(BookingRequestDto request);
    BookingResponse checkInGuest(VerifyCheckinRequestDTO request);
    BookingResponse checkoutGuest(String bookingId);
    BookingResponse cancelBooking(String bookingId);

}
