package com.budgetride.backend.service.Ride;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.budgetride.backend.dao.Ride.RideDaoInterface;
import com.budgetride.backend.entity.RideJPA;

@Service
public class RideService implements RideServiceInterface {

    @Autowired
    private RideDaoInterface rideDao;

    @Override
    public RideJPA save(RideJPA rideJPA) {
        rideDao.save(rideJPA);
        return rideJPA;
    }

}
