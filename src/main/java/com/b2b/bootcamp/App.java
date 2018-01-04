package com.b2b.bootcamp;

import com.b2b.bootcamp.dao.ReservationDao;
import com.b2b.bootcamp.domain.Contributor;
import com.b2b.bootcamp.domain.Reservation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;

import java.time.LocalDateTime;

@SpringBootApplication
public class App implements CommandLineRunner {
    public static void main( String[] args ) {
        SpringApplication.run(App.class,args);
    }

    @Autowired
    ReservationDao dao;

    @Override
    public void run(String... strings) throws Exception {
        Reservation reservation = new Reservation();
        reservation.setArrivalTime(LocalDateTime.now());
        reservation.setDepartureTime(LocalDateTime.now().plusDays(1));
        dao.save(reservation);
        String string = "nic nie znaczaca zmienna";
    }

    //Test
}
