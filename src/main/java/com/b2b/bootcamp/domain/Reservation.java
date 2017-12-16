package com.b2b.bootcamp.domain;

import com.b2b.bootcamp.converter.LocalDateTimeAttributeConverter;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Reservation implements Serializable {

    private final static String pattern = "dd/MM/yyyy HH:mm:ss";

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer maxNumberOfRegistration;
    @Convert(converter = LocalDateTimeAttributeConverter.class)
    private LocalDateTime arrivalTime;
    @Convert(converter = LocalDateTimeAttributeConverter.class)
    private LocalDateTime departureTime;
    private double price;
    @OneToMany(mappedBy = "reservation")
    private List<Contributor> contributors;
}
