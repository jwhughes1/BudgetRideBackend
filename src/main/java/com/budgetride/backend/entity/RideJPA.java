package com.budgetride.backend.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "RIDE")
public class RideJPA implements Serializable {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long rideID;

    @OneToOne(cascade = {CascadeType.MERGE})
    @JoinColumn(name ="DRIVERID", referencedColumnName = "ACCOUNTID")
    private DriverJPA driverJPA;

    @OneToOne(cascade = {CascadeType.MERGE})
    @JoinColumn(name ="CLIENTID", referencedColumnName = "ACCOUNTID")
    private ClientJPA clientJPA;

    @OneToMany(mappedBy = "ride")
    private List<AddressJPA> addressJPA;

    @Column(name = "DISTANCETRAVELLED", nullable = true)
    private int distanceTravelled;

    @Column(name = "COMMENTS", nullable = true)
    private String comments; 

    @Column(name = "COST", nullable = true)
    private String cost; 

    @Column(name = "DATE")
    private LocalDateTime date;
}
