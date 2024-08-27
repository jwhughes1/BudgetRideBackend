package com.budgetride.backend.service.Account;

import com.budgetride.backend.entity.AccountJPA;

public interface AccountServiceInterface {

     AccountJPA save(AccountJPA accountJPA);


    AccountJPA findAccountById(Long id);

    AccountJPA findByPhone(String phone);

    AccountJPA findByEmail(String email);



}
