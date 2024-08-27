package com.budgetride.backend.controller;



import com.budgetride.backend.core.Account;
import com.budgetride.backend.core.Driver;
import com.budgetride.backend.entity.AccountJPA;
import com.budgetride.backend.entity.DriverJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.budgetride.backend.adapter.ClientDbAdapter;
import com.budgetride.backend.core.Client;
import com.budgetride.backend.entity.ClientJPA;
import com.budgetride.backend.service.client.ClientService;


@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class ClientController {

    @Autowired
    private ClientService clientService;

    private ClientDbAdapter clientDbAdapter = new ClientDbAdapter();


    @RequestMapping(method = RequestMethod.POST, path = "/client/{id}", produces = "application/json")
    public Client findClientById(@PathVariable long id) {
        ClientJPA clientJPA = this.clientService.findClientById(id);
        return this.clientDbAdapter.fromDbToCore(clientJPA);

    }

    @RequestMapping(method = RequestMethod.GET, path = "/client/byphone/{phone}", produces = "application/json")
    public Client findClientByPhone(@PathVariable String phone) {
        ClientJPA clientJPA = this.clientService.findByPhone(phone);
        return this.clientDbAdapter.fromDbToCore(clientJPA);

    }

    @RequestMapping(method = RequestMethod.GET, path = "/client/byemail/{email}", produces = "application/json")
    public ResponseEntity<Client> findClientByEmail(@PathVariable String email) {

        ResponseEntity responseEntity;

        ClientJPA clientJPA = this.clientService.findByEmail(email);
        if(clientJPA == null) {
            responseEntity =  new ResponseEntity<>("Account Not Found", HttpStatus.OK);
            return responseEntity;
        }
        responseEntity =  new ResponseEntity<>(clientDbAdapter.fromDbToCore(clientJPA), HttpStatus.OK);
        return responseEntity;
    }





}
