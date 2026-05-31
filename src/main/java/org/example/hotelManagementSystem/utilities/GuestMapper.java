package org.example.hotelManagementSystem.utilities;

import org.example.hotelManagementSystem.data.models.Guest;
import org.example.hotelManagementSystem.dtos.requests.RegisterGuestRequestDto;
import org.example.hotelManagementSystem.dtos.responses.RegisterGuestResponse;

public class GuestMapper {
    public Guest toEntity(RegisterGuestRequestDto request){
        Guest guest = new Guest();
        guest.setEmail(request.getEmail());
        guest.setFirstName(request.getFirstName());
        guest.setLastName(request.getLastName());
        return guest;

    }
    public RegisterGuestResponse toResponse(Guest guest){
   RegisterGuestResponse response = new RegisterGuestResponse();
   response.setFirstName(guest.getFirstName());
       response.setLastName(guest.getLastName());
       response.setEmail(guest.getEmail());
       response.setId(guest.getId());
       return response;
    }

}
