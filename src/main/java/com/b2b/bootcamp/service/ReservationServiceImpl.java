package com.b2b.bootcamp.service;

import com.b2b.bootcamp.dao.ReservationDao;
import com.b2b.bootcamp.domain.Reservation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationServiceImpl implements ReservationService {

    @Autowired
    private ReservationDao dao;

    public List<Reservation> findAll() {
        return (List<Reservation>) dao.findAll();
    }

    public Reservation findById(Long id) {
        return dao.findOne(id);
    }
}
