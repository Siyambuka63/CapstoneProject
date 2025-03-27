package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Address;

import static org.junit.jupiter.api.Assertions.*;

class AddressFactoryTest {

    private Address addressWithInvalidPostalCode = AddressFactory.createAddress(123, "Spin St", "Cape Town", "Western Cape", "A800");
    private Address addressWithoutStreet = AddressFactory.createAddress(123, "", "Cape Town", "Western Cape", "8000");
    private Address addressWithoutCity = AddressFactory.createAddress(123, "Spin St", "", "Western Cape", "8000");
    private Address addressWithoutProvince = AddressFactory.createAddress(123, "Spin St", "Cape Town", "", "8000");
    private Address addressWithoutCountry = AddressFactory.createAddress(123, "Spin St", "Cape Town", "Western Cape", "");
    private Address addressWithoutPostalCode = AddressFactory.createAddress(123, "Spin St", "Cape Town", "Western Cape", "");

    private Address validAddress = AddressFactory.createAddress(123, "Spin St", "Cape Town", "Western Cape", "8000");

    @Test
    void testCreateValidAddress() {
        assertNotNull(validAddress);
        System.out.println(validAddress);
    }

    @Test
    void testCreateAddressWithInvalidPostalCode() {
        assertNotNull(addressWithInvalidPostalCode);
        System.out.println(addressWithInvalidPostalCode);
    }

    @Test
    void testCreateAddressWithoutStreet() {
        assertNotNull(addressWithoutStreet);
        System.out.println(addressWithoutStreet);
    }

    @Test
    void testCreateAddressWithoutCity() {
        assertNotNull(addressWithoutCity);
        System.out.println(addressWithoutCity);
    }

    @Test
    void testCreateAddressWithoutProvince() {
        assertNotNull(addressWithoutProvince);
        System.out.println(addressWithoutProvince);
    }

    @Test
    void testCreateAddressWithoutCountry() {
        assertNotNull(addressWithoutCountry);
        System.out.println(addressWithoutCountry);
    }

    @Test
    void testCreateAddressWithoutPostalCode() {
        assertNotNull(addressWithoutPostalCode);
        System.out.println(addressWithoutPostalCode);
    }
}
