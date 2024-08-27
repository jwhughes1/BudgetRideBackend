package com.budgetride.backend.core;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Address {
    

    private long addressId;

    private String addressType; // use enum, 2 types: destinationOrsource, contact (driver address)

    private String street;

    private String streetNumber;

    private String city;

    private String postalCode;

    private String provinceOrState;

    private String country;
}
