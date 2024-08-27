package com.budgetride.backend.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.budgetride.backend.adapter.VehicleDbAdapter;
import com.budgetride.backend.core.Vehicle;
import com.budgetride.backend.entity.VehicleJPA;
import com.budgetride.backend.service.Vehicle.VehicleService;

@RestController
public class VehicleController {

    @Autowired
    private VehicleService VehicleService;

    private VehicleDbAdapter VehicleDbAdapter = new VehicleDbAdapter();

    
    @RequestMapping(method = RequestMethod.POST, path = "/vehicle/create", produces = "application/json")
    public Vehicle createVehicle(@RequestBody Vehicle Vehicle) {
        VehicleJPA VehicleJPA = this.VehicleDbAdapter.fromCoreToDb(Vehicle);
        this.VehicleService.save(VehicleJPA);
        return this.VehicleDbAdapter.fromDbToCore(VehicleJPA);

    }

    @RequestMapping(method = RequestMethod.POST, path = "/vehicle/{driverId}", produces = "application/json")
    public List<Vehicle>  getDriverVehicles(@PathVariable int driverId) {

        List<Vehicle> vehicles = new ArrayList<>();
       List<VehicleJPA> vehicleJPAs = VehicleService.getDriverVehicles(driverId);

       vehicleJPAs.forEach(v -> {
        vehicles.add(VehicleDbAdapter.fromDbToCore(v));
       });
        
        return vehicles;
    }

}
