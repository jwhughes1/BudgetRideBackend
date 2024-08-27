package com.budgetride.backend.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;


@Getter
@Setter
@Entity
@Table(name = "ADDRESS")
public class AddressJPA implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ADDRESSID")
    private long addressId;

    @Column(name = "ADDRESSTYPE")
    private String addressType;

    @Column(name = "STREET")
    private String street;

    @Column(name = "STREETNUMBER")
    private String streetNumber;

    @Column(name = "CITY")
    private String city;

    @Column(name = "POSTALCODE")
    private String postalCode;

    @Column(name = "PROVINCEORSTATE")
    private String provinceOrState;

    @Column(name = "COUNTRY")
    private String country;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="RIDEID")
    private RideJPA ride;


}
