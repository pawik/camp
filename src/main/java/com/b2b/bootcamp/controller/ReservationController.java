package com.b2b.bootcamp.controller;

import com.b2b.bootcamp.domain.Reservation;
import com.b2b.bootcamp.service.ReservationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/reservation")
public class ReservationController {

    @Autowired
    private ReservationServiceImpl service;

    @RequestMapping("/findAll")
    public List<Reservation> reservations() {
        return service.findAll();
    }

    @RequestMapping("/find")
    public Reservation findById(Long id) {
        return service.findById(id);
    }
}
