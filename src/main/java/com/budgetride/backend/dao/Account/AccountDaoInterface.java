package com.budgetride.backend.dao.Account;

import java.util.List;
import java.util.Optional;

import com.budgetride.backend.core.Account;
import com.budgetride.backend.entity.ClientJPA;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.budgetride.backend.entity.AccountJPA;

@Repository
public interface AccountDaoInterface extends JpaRepository<AccountJPA, Long> {

    AccountJPA findByPhone(String phone);

    AccountJPA findByEmail(String email);

}


