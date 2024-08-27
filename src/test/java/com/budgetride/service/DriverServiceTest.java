package com.budgetride.service;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.budgetride.backend.dao.Driver.DriverDaoInterface;
import com.budgetride.backend.entity.DriverJPA;
import com.budgetride.backend.service.Driver.DriverService;

public class DriverServiceTest {


    @InjectMocks
    private DriverService driverService;

    @Mock
    private DriverDaoInterface driverDao;


    @BeforeEach
	public void setup() {
		//if we don't call below, we will get NullPointerException
		MockitoAnnotations.initMocks(this);
        when(driverDao.save(new DriverJPA())).thenReturn(getDriverJPA());
	}

    @Test
    public void testSaveDriver() {
        assertNotNull(driverDao.save(getDriverJPA()));
        assertEquals( getDriverJPA().getCountry(), driverService.save(getDriverJPA()).getCountry());
    }

    

    public DriverJPA getDriverJPA() {
         DriverJPA driverJPA = new DriverJPA();
    
        driverJPA.setCountry("US");
        driverJPA.setFirstName("testName");

        return driverJPA;



    }




    
}
