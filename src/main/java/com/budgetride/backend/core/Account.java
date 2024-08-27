package com.budgetride.backend.core;

import com.budgetride.backend.enums.AccountTypeEnum;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Account {

    private long accountId;

    private String firstName;

    private String lastName;

    private String email;

    private String phone;

    private AccountTypeEnum type;

    private String dateOfBirth;

    private String sex; // create enum

    private String country;

}
