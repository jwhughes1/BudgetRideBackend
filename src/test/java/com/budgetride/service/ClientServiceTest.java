package com.budgetride.service;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.budgetride.backend.dao.Client.ClientDaoInterface;
import com.budgetride.backend.entity.ClientJPA;
import com.budgetride.backend.service.client.ClientService;

public class ClientServiceTest {


    @InjectMocks
    private ClientService clientService;

    @Mock
    private ClientDaoInterface clientDao;


    @BeforeEach
	public void setup() {
		//if we don't call below, we will get NullPointerException
		MockitoAnnotations.initMocks(this);
        when(clientDao.save(new ClientJPA())).thenReturn(getClientJPA());
	}

    @Test
    public void testSaveClient() {
        assertNotNull(clientService.save(getClientJPA()));
        assertEquals( getClientJPA().getCountry(), clientService.save(getClientJPA()).getCountry());
    }

    public ClientJPA getClientJPA() {
        ClientJPA clientJPA = new ClientJPA();
    
        clientJPA.setCountry("US");
        clientJPA.setFirstName("testName");

        return clientJPA;
    }




    
}
