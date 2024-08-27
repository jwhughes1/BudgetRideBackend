package com.budgetride.backend.core;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
public class Ride {
    private long rideID;

    private Client client;

    private Driver driver;
    
    private List<Address> addresses;

    private int distanceTraveled;

    private String comments;

    private String cost;

    private LocalDateTime date;
    
    public Ride() {

    }

}