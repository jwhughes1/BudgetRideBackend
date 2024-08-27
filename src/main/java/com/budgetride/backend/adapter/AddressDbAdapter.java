package com.budgetride.backend.adapter;

import com.budgetride.backend.core.Address;
import com.budgetride.backend.entity.AddressJPA;

import java.util.ArrayList;
import java.util.List;

public class AddressDbAdapter {


    public AddressJPA fromCoreToDb(Address coreObj) {

        if(coreObj == null) {
            return null;
        }
        AddressJPA dbObject = new AddressJPA();
        dbObject.setAddressId(coreObj.getAddressId());
        dbObject.setAddressType(coreObj.getAddressType());
        dbObject.setStreet(coreObj.getStreet());
        dbObject.setStreetNumber(coreObj.getStreetNumber());
        dbObject.setCity(coreObj.getCity());
        dbObject.setPostalCode(coreObj.getPostalCode());
        dbObject.setCountry(coreObj.getCountry());

        return dbObject;
    }

    public List<AddressJPA> fromCoreToDb(List<Address> coreObj) {

        if(coreObj == null) {
            return null;
        }
        List<AddressJPA> dbObjectList = new ArrayList<>();
        for (Address address : coreObj) {
            AddressJPA dbObject = new AddressJPA();

            dbObject.setAddressId(address.getAddressId());
            dbObject.setAddressType(address.getAddressType());
            dbObject.setStreet(address.getStreet());
            dbObject.setStreetNumber(address.getStreetNumber());
            dbObject.setCity(address.getCity());
            dbObject.setPostalCode(address.getPostalCode());
            dbObject.setCountry(address.getCountry());
            dbObjectList.add(dbObject);
        }
        return dbObjectList;
    }

    public Address fromDbToCore(AddressJPA dbObj) {

        Address coreObject = new Address();
        coreObject.setAddressId(dbObj.getAddressId());
        coreObject.setAddressType(dbObj.getAddressType());
        coreObject.setStreet(dbObj.getStreet());
        coreObject.setStreetNumber(dbObj.getStreetNumber());
        coreObject.setCity(dbObj.getCity());
        coreObject.setPostalCode(dbObj.getPostalCode());
        coreObject.setCountry(dbObj.getCountry());

        return coreObject;

    }

    public List<Address> fromDbToCore(List<AddressJPA> dbObj) {

        List<Address> coreObjectList = new ArrayList<>();
        for (AddressJPA addressJPA : dbObj) {
            Address coreObject = new Address();

            coreObject.setAddressId(addressJPA.getAddressId());
            coreObject.setAddressType(addressJPA.getAddressType());
            coreObject.setStreet(addressJPA.getStreet());
            coreObject.setStreetNumber(addressJPA.getStreetNumber());
            coreObject.setCity(addressJPA.getCity());
            coreObject.setPostalCode(addressJPA.getPostalCode());
            coreObject.setCountry(addressJPA.getCountry());
            coreObject.setAddressId(addressJPA.getAddressId());
            coreObjectList.add(coreObject);
        }

        return coreObjectList;

    }


}
