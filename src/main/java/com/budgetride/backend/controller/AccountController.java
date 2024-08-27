package com.budgetride.backend.controller;


import com.budgetride.backend.adapter.AccountDbAdapter;
import com.budgetride.backend.adapter.ClientDbAdapter;
import com.budgetride.backend.adapter.DriverDbAdapter;
import com.budgetride.backend.core.Account;
import com.budgetride.backend.core.Client;
import com.budgetride.backend.core.Driver;
import com.budgetride.backend.dao.Account.AccountDaoInterface;
import com.budgetride.backend.entity.AccountJPA;
import com.budgetride.backend.entity.ClientJPA;
import com.budgetride.backend.entity.DriverJPA;
import com.budgetride.backend.service.Account.AccountServiceInterface;
import com.budgetride.backend.service.Driver.DriverServiceInterface;
import com.budgetride.backend.service.client.ClientServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class AccountController {

    private final String baseURL = "account";


    @Autowired
    private AccountServiceInterface accountService;

    @Autowired
    private ClientServiceInterface clientService;

    @Autowired
    private DriverServiceInterface driverService;

    @Autowired
    private AccountDaoInterface accountDao;

    private AccountDbAdapter accountDbAdapter = new AccountDbAdapter();

    private ClientDbAdapter clientDbAdapter = new ClientDbAdapter();

    private DriverDbAdapter driverDbAdapter = new DriverDbAdapter();


    /**
     * Creates client account
     * @param client
     * @return responseEntity<Client></Client>
     */
    @RequestMapping(method = RequestMethod.POST, path = baseURL + "/client/create", produces = "application/json")
    public ResponseEntity<Client> createClientAccount(@RequestBody Client client) {

        ClientJPA clientJPA = this.clientDbAdapter.fromCoreToDb(client);
        AccountJPA accountSearchByPhone =  accountService.findByPhone(client.getPhone());
        AccountJPA accountSearchByEmail = accountService.findByEmail(client.getEmail());

        ResponseEntity responseEntity;

        if(accountSearchByPhone != null || accountSearchByEmail != null) {

            responseEntity = new ResponseEntity<>("client account already exists", HttpStatus.OK);
            return responseEntity;

        }
        Client savedClient = clientDbAdapter.fromDbToCore(clientService.save(clientJPA));
        responseEntity =  new ResponseEntity<>(savedClient, HttpStatus.OK);
        return responseEntity;

    }


    @RequestMapping(method = RequestMethod.POST, path = baseURL + "/driver/create", produces = "application/json")
    public ResponseEntity<Driver> createDriverAccount(@RequestBody Driver driver) {

        DriverJPA driverJPA = this.driverDbAdapter.fromCoreToDb(driver);
        AccountJPA accountSearchByPhone = accountService.findByPhone(driver.getPhone());
        AccountJPA accountSearchByEmail = accountService.findByEmail(driver.getEmail());
        ResponseEntity responseEntity;

        if(accountSearchByPhone != null || accountSearchByEmail != null) {

            responseEntity = new ResponseEntity<>("Driver account already exists", HttpStatus.OK);
            return responseEntity;
        }
            Driver savedDriver = driverDbAdapter.fromDbToCore(driverService.save(driverJPA));
            responseEntity =  new ResponseEntity<>(savedDriver, HttpStatus.OK);
            return responseEntity;
    }

    /**
     *
     * @param id
     * @return account specific information
     */
    @RequestMapping(method = RequestMethod.GET, path = baseURL + "/byId/{id}", produces = "application/json")
    public Account findAccountById(@PathVariable Long id) {
        return accountDbAdapter.fromDbToCore(accountService.findAccountById(id));
    }

    /**
     * Finds account by phone
     * @param phone
     * @return
     */

    @RequestMapping(method = RequestMethod.GET, path = baseURL+"/byPhone/{phone}", produces = "application/json")
    public ResponseEntity<Account> findAccountByPhone(@PathVariable String phone) {

        ResponseEntity responseEntity;

        AccountJPA accountJPA = accountService.findByPhone(phone);
        if(accountJPA == null) {
            responseEntity =  new ResponseEntity<>("Account Not Found", HttpStatus.OK);
            return responseEntity;
        }
        responseEntity =  new ResponseEntity<>(accountDbAdapter.fromDbToCore(accountJPA), HttpStatus.OK);
        return responseEntity;
    }


    /**
     * Finds account by email
     * @param email
     * @return
     */
    @RequestMapping(method = RequestMethod.GET, path = baseURL+"/byEmail/{email}", produces = "application/json")
    public ResponseEntity<Account> findAccountByEmail(@PathVariable String email) {

        ResponseEntity responseEntity;

        AccountJPA accountJPA = accountService.findByEmail(email);
        if(accountJPA == null) {
            responseEntity =  new ResponseEntity<>("Account Not Found", HttpStatus.OK);
            return responseEntity;
        }
        responseEntity =  new ResponseEntity<>(accountDbAdapter.fromDbToCore(accountJPA), HttpStatus.OK);
        return responseEntity;
    }


    /**
     * Creating an account does not create a client
     */
    @RequestMapping(method = RequestMethod.POST, path = baseURL + "/{type}/create", produces = "application/json")
    public Account createAccount(@RequestBody Account account, @PathVariable String type) {

        if (type.equals("client")) {
            /**
             * Creating an account does not create a client
             */
            AccountJPA accountJPA = accountDao.save(accountDbAdapter.fromCoreToDb(account));
        }

        return null;
    }
}

