package com.budgetride.backend.dao.Vehicle;

import com.budgetride.backend.entity.VehicleJPA;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface VehicleDaoInterface extends JpaRepository<VehicleJPA, Long> {

    @Query(
    value = "SELECT * FROM VEHICLE v WHERE v.driverId = :driverId", 
    nativeQuery = true)
    List<VehicleJPA> findDriverVehicles(int driverId);

}
