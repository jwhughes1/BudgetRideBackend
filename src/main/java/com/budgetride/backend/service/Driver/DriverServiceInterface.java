package com.budgetride.backend.service.Driver;

import com.budgetride.backend.entity.DriverJPA;

public interface DriverServiceInterface {

    DriverJPA save(DriverJPA driverJPA);

    DriverJPA findDriverById(Long id);

    DriverJPA findByPhone(String phone);

}
