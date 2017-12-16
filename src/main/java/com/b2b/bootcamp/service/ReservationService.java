package com.b2b.bootcamp.service;

import com.b2b.bootcamp.domain.Reservation;

import java.util.List;

public interface ReservationService {

    List<Reservation> findAll();
    Reservation findById(Long id);
}
