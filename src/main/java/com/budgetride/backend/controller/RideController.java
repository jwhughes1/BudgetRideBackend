package com.budgetride.backend.controller;

import com.budgetride.backend.adapter.AddressDbAdapter;
import com.budgetride.backend.core.Address;
import com.budgetride.backend.entity.AddressJPA;
import com.budgetride.backend.service.Ride.RideServiceInterface;
import com.budgetride.backend.service.address.AddressServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.budgetride.backend.adapter.RideDbAdapter;
import com.budgetride.backend.core.Ride;
import com.budgetride.backend.entity.RideJPA;

import java.util.ArrayList;
import java.util.List;

@RestController
public class RideController {

    @Autowired
    private RideServiceInterface rideService;

    @Autowired
    AddressServiceInterface addressService;

    // @Autowired
    private final RideDbAdapter rideDbAdapter = new RideDbAdapter();

    private final AddressDbAdapter addressDbAdapter = new AddressDbAdapter();

    // @PostMapping("Ride/create")
    @RequestMapping(method = RequestMethod.POST, path = "/ride/create", produces = "application/json")
    public Ride createRide(@RequestBody Ride ride) {

        // **** save the ride
        RideJPA rideJPA = this.rideDbAdapter.fromCoreToDb(ride);
        this.rideService.save(rideJPA);

        List<AddressJPA> addressJPAList = new ArrayList<>();
        for (Address address : ride.getAddresses()) {
            AddressJPA dbAddress = addressDbAdapter.fromCoreToDb(address);
            dbAddress.setRide(rideJPA);
            AddressJPA savedJpa = addressService.save(dbAddress);
            savedJpa.setRide(rideJPA);
           // rideJPA.setAddressJPA(savedJpa);
            addressJPAList.add(savedJpa);
        }
       rideJPA.setAddressJPA(addressJPAList);
        return this.rideDbAdapter.fromDbToCore(rideJPA);


        // first need to save the addresses
//        List<AddressJPA> addressJPAList = new ArrayList<>();
//        for (Address address : ride.getAddresses()) {
//            AddressJPA dbAddress = addressDbAdapter.fromCoreToDb(address);
//            AddressJPA savedJpa = addressService.save(dbAddress);
//            addressJPAList.add(savedJpa);
//        }
//
//        ride.setAddresses(addressDbAdapter.fromDbToCore(addressJPAList));
//
//        RideJPA rideJPA = this.rideDbAdapter.fromCoreToDb(ride);
//        rideJPA.setAddressJPA(addressJPAList);
//        this.rideService.save(rideJPA);
//        return this.rideDbAdapter.fromDbToCore(rideJPA);

        // }

    }

}
