package com.budgetride.backend.adapter;


import com.budgetride.backend.core.Ride;
import com.budgetride.backend.entity.RideJPA;


public class RideDbAdapter {


private final DriverDbAdapter driverDbAdapter = new DriverDbAdapter();

private final ClientDbAdapter clientDbAdapter = new ClientDbAdapter();
private final  AddressDbAdapter addressDbAdapter = new AddressDbAdapter();



    public RideJPA fromCoreToDb(Ride ride) {

        RideJPA rideJPA = new RideJPA();

        rideJPA.setRideID(ride.getRideID());
        rideJPA.setClientJPA( clientDbAdapter.fromCoreToDb(ride.getClient()));
        rideJPA.setDriverJPA(driverDbAdapter.fromCoreToDb(ride.getDriver()));
        rideJPA.setAddressJPA(addressDbAdapter.fromCoreToDb(ride.getAddresses()));
        rideJPA.setDistanceTravelled(ride.getDistanceTraveled());
        rideJPA.setComments(ride.getComments());
        rideJPA.setCost(ride.getCost());
        rideJPA.setDate(ride.getDate());

        return rideJPA;

    }

    public Ride fromDbToCore(RideJPA rideJPA) {

        Ride ride = new Ride();

        ride.setClient(clientDbAdapter.fromDbToCore(rideJPA.getClientJPA()));
        ride.setDriver(driverDbAdapter.fromDbToCore(rideJPA.getDriverJPA()));
        ride.setRideID(rideJPA.getRideID());
        ride.setDistanceTraveled(rideJPA.getDistanceTravelled());
        ride.setComments(rideJPA.getComments());
        ride.setCost(rideJPA.getCost());
        ride.setDate(rideJPA.getDate());
        ride.setAddresses(addressDbAdapter.fromDbToCore(rideJPA.getAddressJPA()));
        return ride;

    }

}
