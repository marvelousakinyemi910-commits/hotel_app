package org.example.hotelManagementSystem.utilities;

import org.example.hotelManagementSystem.data.models.Booking;
import org.example.hotelManagementSystem.dtos.requests.BookingRequestDto;
import org.example.hotelManagementSystem.dtos.responses.BookingResponse;
import org.springframework.stereotype.Component;

@Component
public class BookingMapper {
    public BookingResponse toBookingResponse(Booking booking) {
        BookingResponse bookingResponse = new BookingResponse();
        bookingResponse.setBookingId(booking.getId());
        bookingResponse.setCheckInDate(booking.getCheckinDate());
        bookingResponse.setCheckOutDate(booking.getCheckoutDate());

        return bookingResponse;


    }
    public  Booking toEntity(BookingRequestDto request) {
        Booking booking = new Booking();
        booking.setCheckinDate(request.getCheckInDate());
        booking.setCheckoutDate(request.getCheckOutDate());
        return booking;
    }
}
