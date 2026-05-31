package org.example.hotelManagementSystem.services;

import org.example.hotelManagementSystem.data.models.Booking;
import org.example.hotelManagementSystem.data.models.Room;
import org.example.hotelManagementSystem.data.models.enums.BookingStatus;
import org.example.hotelManagementSystem.data.models.enums.RoomStatus;
import org.example.hotelManagementSystem.data.repositories.BookingRepository;
import org.example.hotelManagementSystem.data.repositories.RoomRepository;
import org.example.hotelManagementSystem.dtos.requests.BookingRequestDto;
import org.example.hotelManagementSystem.dtos.requests.VerifyCheckinRequestDTO;
import org.example.hotelManagementSystem.dtos.responses.BookingResponse;
import org.example.hotelManagementSystem.exceptions.BookingNotFound;
import org.example.hotelManagementSystem.utilities.BookingMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component @Service
public class BookServiceImpl implements  BookingService {
@Autowired
private BookingRepository bookingRepository;
@Autowired
private BookingMapper bookingMapper;
@Autowired
private RoomRepository roomRepository;
    @Override
    public BookingResponse createBooking(BookingRequestDto request) {
        Booking booking = bookingMapper.toEntity(request);
        Booking savedBooking = bookingRepository.save(booking);
        return bookingMapper.toBookingResponse(savedBooking);
    }

    @Override
    public BookingResponse checkInGuest(VerifyCheckinRequestDTO request) {
        Booking booking = bookingRepository.findById(request.getBookingId()).orElseThrow(() -> new BookingNotFound("Booking not found"));
        if (booking.getBookingStatus() == BookingStatus.CHECKED_IN) { throw new RuntimeException("Guest already checked in");

        }
        booking.setBookingStatus(BookingStatus.CHECKED_IN);
        Room room = booking.getRoom();
        room.setRoomStatus(RoomStatus.OCCUPIED);
        roomRepository.save(room);
        Booking savedBooking = bookingRepository.save(booking);
        return bookingMapper.toBookingResponse(savedBooking);
    }
    @Override
    public BookingResponse checkoutGuest(String bookingId) {
        return null;
    }

    @Override
    public BookingResponse cancelBooking(String bookingId) {
        return null;
    }


}
