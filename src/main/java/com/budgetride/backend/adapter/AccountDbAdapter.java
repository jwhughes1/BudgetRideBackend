package com.budgetride.backend.adapter;

import com.budgetride.backend.core.Account;
import com.budgetride.backend.core.Client;
import com.budgetride.backend.entity.AccountJPA;
import com.budgetride.backend.entity.ClientJPA;
import com.budgetride.backend.enums.AccountTypeEnum;

public class AccountDbAdapter {

    public AccountJPA fromCoreToDb(Account account) {

        AccountJPA accountJPA = new AccountJPA();

        accountJPA.setCountry(account.getCountry());
        accountJPA.setDateOfBirth(account.getDateOfBirth());
        accountJPA.setEmail(account.getEmail());
        accountJPA.setFirstName(account.getFirstName());
        accountJPA.setLastName(account.getLastName());
        accountJPA.setPhone(account.getPhone());
        accountJPA.setSex(account.getSex());
        accountJPA.setType(AccountTypeEnum.CLIENT.getValue());

        return accountJPA;

    }

    public Account fromDbToCore(AccountJPA accountJPA) {

        Account account = new Account();
        if(accountJPA == null) {
            return null;
        }
        account.setAccountId(accountJPA.getAccountId());
        account.setCountry(accountJPA.getCountry());
        account.setDateOfBirth(accountJPA.getDateOfBirth());
        account.setEmail(accountJPA.getEmail());
        account.setFirstName(accountJPA.getFirstName());
        account.setLastName(accountJPA.getLastName());
        account.setPhone(accountJPA.getPhone());
        account.setSex(accountJPA.getSex());
        account.setType(AccountTypeEnum.valueToEnum(accountJPA.getType()));
        System.out.println("client in adapter"+ account);

        return account;
    }
}
