package com.budgetride.backend.service.address;

import com.budgetride.backend.entity.AddressJPA;

import java.util.Optional;

public interface AddressServiceInterface {

    Optional<AddressJPA> findAddressById(long id);

    AddressJPA save(AddressJPA addressJPA);




}
