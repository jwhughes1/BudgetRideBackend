package com.budgetride.backend.dao.address;

import com.budgetride.backend.entity.AddressJPA;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AddressDaoInterface extends JpaRepository<AddressJPA, Long> {


}
