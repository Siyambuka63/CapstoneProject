/*
AddressRepository.java
Address repository class
Author: Nkheso Mathebula 230762883
*/
package za.ac.cput.repository;

import za.ac.cput.domain.Address;

import java.util.HashSet;
import java.util.Set;

public class AddressRepository {
    private static AddressRepository repository = null;
    private Set<Address> addressDB;

    private AddressRepository() {
        this.addressDB = new HashSet<>();
    }

    public static AddressRepository getRepository() {
        if (repository == null) {
            repository = new AddressRepository();
        }
        return repository;
    }

    public Address create(Address address) {
        boolean added = addressDB.add(address);
        return added ? address : null;
    }

    public Address read(int houseNumber, String streetName) {
        return addressDB.stream()
                .filter(a -> a.getHouseNumber() == houseNumber && a.getStreetName().equals(streetName))
                .findFirst()
                .orElse(null);
    }

    public Address update(Address address) {
        Address existingAddress = read(address.getHouseNumber(), address.getStreetName());
        if (existingAddress != null) {
            addressDB.remove(existingAddress);
            addressDB.add(address);
            return address;
        }
        return null;
    }

    public boolean delete(int houseNumber, String streetName) {
        Address address = read(houseNumber, streetName);
        if (address != null) {
            addressDB.remove(address);
            return true;
        }
        return false;
    }

    public Set<Address> getAll() {
        return addressDB;
    }
}

