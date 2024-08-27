package com.budgetride.backend.controller;


import com.budgetride.backend.service.Account.AccountServiceInterface;
import com.budgetride.backend.service.Driver.DriverServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.budgetride.backend.adapter.DriverDbAdapter;
import com.budgetride.backend.core.Driver;
import com.budgetride.backend.entity.DriverJPA;

@RestController
public class DriverController {

    @Autowired
    private DriverServiceInterface driverService;

    @Autowired
    private AccountServiceInterface accountService;

       
    private DriverDbAdapter driverDbAdapter = new DriverDbAdapter();


    @RequestMapping(method = RequestMethod.GET, path = "/driver/{id}", produces = "application/json")
    public Driver findDriverById(@PathVariable long id) {
        DriverJPA driverJPA = this.driverService.findDriverById(id);
        return this.driverDbAdapter.fromDbToCore(driverJPA);

    }



@RequestMapping(method = RequestMethod.GET, path = "/driver/byphone/{phone}", produces = "application/json")
public Driver findDriverByPhone(@PathVariable String phone) {
    DriverJPA driverJPA = this.driverService.findByPhone(phone);
    return this.driverDbAdapter.fromDbToCore(driverJPA);

}
}


