package com.budgetride.backend.service.address;

import com.budgetride.backend.dao.address.AddressDaoInterface;
import com.budgetride.backend.entity.AddressJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AddressService implements AddressServiceInterface{

    @Autowired
    private AddressDaoInterface addressDao;
    @Override
    public Optional<AddressJPA> findAddressById(long id) {
        return addressDao.findById(id);
    }

    @Override
    public AddressJPA save(AddressJPA addressJPA) {
        return addressDao.save(addressJPA);
    }

    public Iterable<AddressJPA> save(List<AddressJPA> addressJPAList) {
        return  addressDao.saveAll(addressJPAList);
    }
}
