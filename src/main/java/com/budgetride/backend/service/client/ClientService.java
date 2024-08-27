package com.budgetride.backend.service.client;

import com.budgetride.backend.dao.Client.ClientDaoInterface;
import com.budgetride.backend.entity.ClientJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService implements ClientServiceInterface {

    @Autowired
    private ClientDaoInterface clientDao;


    @Override
    public ClientJPA save(ClientJPA clientJPA) {
        clientDao.save(clientJPA);
        return clientJPA;
    }

    @Override
    public ClientJPA findByPhone(String phone) {

        try {

            ClientJPA clientJPA =  clientDao.findByPhone(phone);
            return clientJPA ;
        }
        catch (Exception e) {
            return null;
        }
    }

    @Override
    public ClientJPA findByEmail(String email) {
        try {

            ClientJPA clientJPA =  clientDao.findByEmail(email);
            return clientJPA ;
        }
        catch (Exception e) {
            return null;
        }
    }


//    public ClientJPA findClientByPhone(String phone) {
//        ClientJPA client = clientDao.findClientByPhone(phone);
//        return client;
//    }

    @Override
    public ClientJPA findClientById(Long id) {
        ClientJPA clientJPA = clientDao.findClientById(id);
        return clientJPA;
    }


}
