package com.budgetride.backend.dao.Ride;

import com.budgetride.backend.entity.RideJPA;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RideDaoInterface extends JpaRepository<RideJPA, Long> {

}
