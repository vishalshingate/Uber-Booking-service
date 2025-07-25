package com.example.uberbookingservice.dto;


import com.example.uberprojectentity.models.BookingStatus;
import com.example.uberprojectentity.models.Driver;
import lombok.*;

import java.util.Optional;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UpdateBookingResponseDto {

    private Long bookingId;
    private BookingStatus status;
    private Optional<Driver> driver;

}
