package com.example.uberbookingservice.services;

import com.example.uberbookingservice.dto.CreateBookingDto;
import com.example.uberbookingservice.dto.CreateBookingResponseDto;

public interface BookingService {
    public CreateBookingResponseDto createBooking(CreateBookingDto booking);
}
