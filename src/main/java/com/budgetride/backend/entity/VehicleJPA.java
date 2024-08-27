package com.budgetride.backend.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "VEHICLE")
public class VehicleJPA {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long vehicleId;

    @Column(name = "DRIVERID", nullable = true)
    private int driverId;

    @Column(name = "PLATENUMBER", nullable = true)
    private String plateNumber;

    @Column(name = "VEHICLETYPE", nullable = true)
    private String vehicleType;

    @Column(name = "NUMBEROFSEATS", nullable = true)
    private int numberOfSeats;
}
