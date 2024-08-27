package com.budgetride.backend.core;

import lombok.Getter;
import lombok.Setter;
import java.util.List;

import com.budgetride.backend.enums.DriverStatusEnum;


@Getter
@Setter
public class Driver extends Account {


    private String vehicleTypeInService;

   private List<Vehicle> vehicles;

   private DriverStatusEnum status; // use enum
    // @Getter @Setter private long accountId;
    
    public Driver() {

    }

}