package com.budgetride.backend.service.client;

import com.budgetride.backend.entity.ClientJPA;

public interface ClientServiceInterface {

    ClientJPA save(ClientJPA clientJPA);

    ClientJPA findByPhone(String phone);

    ClientJPA findByEmail(String email);

    ClientJPA findClientById(Long id);

}
