package org.example.hotelManagementSystem.data.models;

import java.time.LocalDate;




import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
    @Data
    public class Booking {
        private Room room;
        private Guest guest;
        private LocalDate checkinDate;
        private LocalDate checkoutDate;


    }


