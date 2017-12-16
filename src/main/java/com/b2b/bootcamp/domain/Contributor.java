package com.b2b.bootcamp.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Contributor implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double amountToPay;
    private boolean isPaid;
    private double discount;
    @OneToMany(mappedBy = "contributor")
    private List<PersonalData> data;
    @ManyToOne
    private Reservation reservation;
}
