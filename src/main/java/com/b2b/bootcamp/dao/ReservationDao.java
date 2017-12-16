package com.b2b.bootcamp.dao;

import com.b2b.bootcamp.domain.Reservation;
import org.springframework.data.repository.CrudRepository;

public interface ReservationDao extends CrudRepository<Reservation, Long> {
}
