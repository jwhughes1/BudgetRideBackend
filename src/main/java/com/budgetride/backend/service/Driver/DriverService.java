package com.budgetride.backend.service.Driver;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.budgetride.backend.dao.Driver.DriverDaoInterface;
import com.budgetride.backend.entity.DriverJPA;

@Service
public class DriverService implements DriverServiceInterface {

    @Autowired
    private DriverDaoInterface driverDao;

    @Override
    public DriverJPA save(DriverJPA driverJPA) {
        driverDao.save(driverJPA);
        return driverJPA;
    }

    @Override
    public DriverJPA findDriverById(Long id) {

        try {
            DriverJPA driverJPA =  driverDao.findById(id).get();
            return driverJPA;
        }
        catch (Exception e) {
            return null;
        }

    }



    @Override
    public DriverJPA findByPhone(String phone) {

        try {

            DriverJPA driverJPA =  driverDao.findByPhone(phone);
            return driverJPA;
        }
        catch (Exception e) {
            return null;
        }
    }

}
