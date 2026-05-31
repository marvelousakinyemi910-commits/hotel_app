package org.example.hotelManagementSystem.exceptions;

public class BookingNotFound extends RuntimeException {
    public BookingNotFound(String message) {
        super(message);
    }
}
