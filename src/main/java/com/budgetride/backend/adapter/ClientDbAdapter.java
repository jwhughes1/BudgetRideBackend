package com.budgetride.backend.adapter;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.budgetride.backend.core.Client;
import com.budgetride.backend.entity.ClientJPA;
import com.budgetride.backend.enums.AccountTypeEnum;

public class ClientDbAdapter {

    public ClientJPA fromCoreToDb(Client client) {

        ClientJPA clientJPA = new ClientJPA();

        clientJPA.setNumberOfMilesTravelled(client.getNumberOfMilesTravelled());
        clientJPA.setCountry(client.getCountry());
        clientJPA.setDateOfBirth(client.getDateOfBirth());
        clientJPA.setEmail(client.getEmail());
        clientJPA.setFirstName(client.getFirstName());
        clientJPA.setLastName(client.getLastName());
        clientJPA.setPhone(client.getPhone());
        clientJPA.setSex(client.getSex());
        clientJPA.setType(AccountTypeEnum.CLIENT.getValue());

        return clientJPA;

    }

    public Client fromDbToCore(ClientJPA clientJPA) {
        Client client = new Client();
        if(clientJPA == null) {
            return null;
        }
        client.setAccountId(clientJPA.getAccountId());
        client.setNumberOfMilesTravelled(clientJPA.getNumberOfMilesTravelled());
        client.setCountry(clientJPA.getCountry());
        client.setDateOfBirth(clientJPA.getDateOfBirth());
        client.setEmail(clientJPA.getEmail());
        client.setFirstName(clientJPA.getFirstName());
        client.setLastName(clientJPA.getLastName());
        client.setPhone(clientJPA.getPhone());
        client.setSex(clientJPA.getSex());
        // client.setPaymentInfo(clientJPA.getPaymentInfo());
        // client.setRewards(clientJPA.getRewards());
        client.setType(AccountTypeEnum.valueToEnum(clientJPA.getType()));
        System.out.println("client in adapter"+ client);

        return client;
    }
}