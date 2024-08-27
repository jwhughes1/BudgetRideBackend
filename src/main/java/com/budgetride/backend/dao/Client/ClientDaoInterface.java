package com.budgetride.backend.dao.Client;

import com.budgetride.backend.entity.ClientJPA;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ClientDaoInterface extends JpaRepository<ClientJPA, Long> {

    @Query(
            value = "SELECT * FROM CLIENT c join Account a  WHERE c.accountid =? and c.accountid=a.accountid ",
            nativeQuery = true)
    ClientJPA findClientById(Long id);

    ClientJPA findByPhone(String phone);

    ClientJPA findByEmail(String email);



//    @Query(
//            value = "SELECT * FROM CLIENT c join Account a  WHERE a.phone =? and c.accountid=a.accountid ",
//            nativeQuery = true)
//    ClientJPA findClientByPhone(String phone);

    // TODO does not work, need to know why
//    @Query(
//            value = "SELECT * FROM CLIENT c WHERE c.accountid =? ",
//            nativeQuery = true)
//    ClientJPA findClientById(Long id);
}
