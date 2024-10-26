package com.example.bookmyshowaug24.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Seat extends BaseModel {
    private String seatNumber;

    private int rowVal;
    private int colVal;

    @ManyToOne
    private SeatType seatType;
}

/*

 1           1
Seat ---- SeatType
 M           1

 */