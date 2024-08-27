package com.budgetride.backend.adapter;

import com.budgetride.backend.core.Vehicle;
import com.budgetride.backend.entity.VehicleJPA;


public class VehicleDbAdapter {


    public VehicleJPA fromCoreToDb(Vehicle vehicle) {

        VehicleJPA vehicleJPA = new VehicleJPA();
        vehicleJPA.setVehicleId(vehicle.getVehicleId());
        // vehicleJPA.setDriver(driverDbAdapter.fromCoreToDb(vehicle.getDriver()));
        vehicleJPA.setDriverId(vehicle.getDriverId());
        vehicleJPA.setPlateNumber(vehicle.getPlateNumber());
        vehicleJPA.setVehicleType(vehicle.getVehicleType());
        vehicleJPA.setNumberOfSeats(vehicle.getNumberOfSeats());

        return vehicleJPA;
    }

    public Vehicle fromDbToCore(VehicleJPA vehicleJPA) {

        Vehicle vehicle = new Vehicle();
        vehicle.setVehicleId(vehicleJPA.getVehicleId());
    //   vehicle.setDriver(driverDbAdapter.fromDbToCore(vehicleJPA.getDriver()));
        vehicle.setDriverId(vehicleJPA.getDriverId());
        vehicle.setPlateNumber(vehicleJPA.getPlateNumber());
        vehicle.setVehicleType(vehicleJPA.getVehicleType());
        vehicle.setNumberOfSeats(vehicleJPA.getNumberOfSeats());
        return vehicle;

    }

}
