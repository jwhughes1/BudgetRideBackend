package com.budgetride.backend.service.Vehicle;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.budgetride.backend.dao.Vehicle.VehicleDaoInterface;
import com.budgetride.backend.entity.VehicleJPA;

@Service
public class VehicleService implements VehicleServiceInterface {

    @Autowired
    private VehicleDaoInterface vehicleDao;

    @Override
    public VehicleJPA save(VehicleJPA vehicleJPA) {
        vehicleDao.save(vehicleJPA);
        return vehicleJPA;
    }

    public List<VehicleJPA> getDriverVehicles(int driverId) {
       return vehicleDao.findDriverVehicles(driverId);
    }

}
