package com.budgetride.backend.service.Account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.budgetride.backend.dao.Account.AccountDaoInterface;
import com.budgetride.backend.entity.AccountJPA;

@Service
public class AccountService implements AccountServiceInterface {

    @Autowired
    private AccountDaoInterface accountDao;

    @Override
    public AccountJPA save(AccountJPA accountJPA) {
        return accountDao.save(accountJPA);
    }


    @Override
    public AccountJPA findAccountById(Long id) {
      //  return this.accountDao.findAccountById(id);
        return accountDao.getReferenceById(id);
    }

    @Override
    public AccountJPA findByPhone(String phone) {
        return accountDao.findByPhone(phone);
    }

    @Override
    public AccountJPA findByEmail(String email) {
        return accountDao.findByEmail(email);
    }

}
