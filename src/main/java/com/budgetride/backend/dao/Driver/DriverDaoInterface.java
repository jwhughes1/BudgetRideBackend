package com.budgetride.backend.dao.Driver;

import com.budgetride.backend.entity.DriverJPA;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DriverDaoInterface extends JpaRepository<DriverJPA, Long> {

    DriverJPA findByPhone(String phone);
}
