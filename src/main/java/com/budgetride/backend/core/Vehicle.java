package com.budgetride.backend.core;

import lombok.Getter;
import lombok.Setter;

public class Vehicle {
    @Getter @Setter private long vehicleId;
    // @Getter @Setter private Driver driver;
    @Getter @Setter private int driverId;
    @Getter @Setter private String plateNumber;
    @Getter @Setter private String vehicleType;
    @Getter @Setter private int numberOfSeats;

    public Vehicle() {

    }

}