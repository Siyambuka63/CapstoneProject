/*
AddressRepositoryTest.java
Address repository test class
Author: Nkheso Mathebula 230762883
*/
package za.ac.cput.repository;

import org.junit.jupiter.api.*;
import za.ac.cput.domain.Address;
import za.ac.cput.factory.AddressFactory;


import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class AddressRepositoryTest {

    private static AddressRepository addressRepository = AddressRepository.getRepository(); 

    private static Address address = AddressFactory.createAddress(101, "Spin Street", "Cape Town", "Cape Town", "80000");

    @Test
    @Order(1)
    void create() {
        Address createdAddress = addressRepository.create(address);
        assertNotNull(createdAddress);
        System.out.println("Created Address: " + createdAddress);
    }

    @Test
    @Order(2)
    void read() {
        assert address != null;
        Address readAddress = addressRepository.read(address.getHouseNumber(), address.getStreetName());
        assertNotNull(readAddress);
        assertEquals(address.getPostalCode(), readAddress.getPostalCode());
        System.out.println("Read Address: " + readAddress);
    }

    @Test
    @Order(3)
    void update() {
        Address updatedAddress = AddressFactory.createAddress(102, "Dorset Street", "Cape Town", "Cape Town", "8000");
        assert updatedAddress != null;
        Address result = addressRepository.update(updatedAddress);
        assertNotNull(result);
        assertEquals("8000", result.getPostalCode());
        System.out.println("Updated Address: " + result);
    }

    @Test
    @Order(4)
    void delete() {
        assert address != null;
        boolean deleted = addressRepository.delete(address.getHouseNumber(), address.getStreetName());
        assertTrue(deleted);
        System.out.println("Deleted Address: " + address);
    }

    @Test
    @Order(5)
    void getAll() {
        Set<Address> addresses = addressRepository.getAll();
        assertNotNull(addresses);
        System.out.println("All Addresses: " + addresses);
    }
}
