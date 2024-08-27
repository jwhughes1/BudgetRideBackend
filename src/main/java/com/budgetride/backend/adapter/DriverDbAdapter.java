package com.budgetride.backend.adapter;


import com.budgetride.backend.core.Driver;
import com.budgetride.backend.entity.DriverJPA;
import com.budgetride.backend.enums.AccountTypeEnum;
import com.budgetride.backend.enums.DriverStatusEnum;

public class DriverDbAdapter {

   //private VehicleDbAdapter vehicleDbAdapter = new VehicleDbAdapter();


    public DriverJPA fromCoreToDb(Driver driver) {

        DriverJPA driverJPA = new DriverJPA();
        if(driver == null) {
            return null;
        }

       // driverJPA.setAccountId(driver.getAccountId());
        driverJPA.setCountry(driver.getCountry());
        driverJPA.setDateOfBirth(driver.getDateOfBirth());
        driverJPA.setEmail(driver.getEmail());
        driverJPA.setFirstName(driver.getFirstName());
        driverJPA.setLastName(driver.getLastName());
        driverJPA.setPhone(driver.getPhone());
        driverJPA.setType(AccountTypeEnum.DRIVER.getValue());
        driverJPA.setVehicleTypeInService(driver.getVehicleTypeInService());
        if(driver.getStatus() !=null && driver.getStatus().equals(DriverStatusEnum.AVAILABLE)){
            driverJPA.setStatus(DriverStatusEnum.AVAILABLE.getValue());
        }
        else if (driver.getStatus() !=null && driver.getStatus().equals(DriverStatusEnum.UNAVAILABLE)){
            driverJPA.setStatus(DriverStatusEnum.UNAVAILABLE.getValue());
        }
        
        driverJPA.setSex(driver.getSex());

        if (driver.getVehicles()!= null && driver.getVehicles().size() != 0) {
        
        //    List<VehicleJPA> vehicleJPAList = driver.getVehicles().stream()
        //        .map(vehicle -> vehicleDbAdapter.fromCoreToDb(vehicle))
        //        .collect(Collectors.toList());        
          // driverJPA.setVehicleJPA(vehicleJPAList);   
        }

        return driverJPA;

    }

    public Driver fromDbToCore(DriverJPA driverJPA) {

        Driver driver = new Driver();
        if(driverJPA == null) {
            return null;
        }
        driver.setAccountId(driverJPA.getAccountId());
        driver.setCountry(driverJPA.getCountry());
        driver.setDateOfBirth(driverJPA.getDateOfBirth());
        driver.setEmail(driverJPA.getEmail());
        driver.setFirstName(driverJPA.getFirstName());
        driver.setLastName(driverJPA.getLastName());
        driver.setPhone(driverJPA.getPhone());
        driver.setType(AccountTypeEnum.valueToEnum(driverJPA.getType()));
        // if(driver.getVehicles() == null){
        //     List<Vehicle> vList = new ArrayList<>();
        //     for(VehicleJPA v : driverJPA.getVehicleJPAs()) {
        //         vList.add(VehicleDbAdapter v));
        //     }
        //     driver.setVehicles(vList);
        // }
        
        driver.setVehicleTypeInService(driverJPA.getVehicleTypeInService());
        driver.setStatus(DriverStatusEnum.valueToEnum(driverJPA.getStatus()));
        driver.setSex(driverJPA.getSex());
        return driver;

    }

}
