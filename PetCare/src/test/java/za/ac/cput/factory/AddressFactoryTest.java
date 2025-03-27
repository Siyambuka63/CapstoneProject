package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Address;

import static org.junit.jupiter.api.Assertions.*;

class AddressFactoryTest {

    private Address addressWithInvalidPostalCode = AddressFactory.createAddress(123, "Spin St", "Cape Town", "Western Cape", "A800");
    private Address addressWithoutStreet = AddressFactory.createAddress(123, "", "Cape Town", "Western Cape", "8000");
    private Address addressWithoutStreetName = AddressFactory.createAddress(123, "", "Cape Town", "Western Cape", "8000");
    private Address addressWithoutCity = AddressFactory.createAddress(123, "Spin St", "", "Western Cape", "8000");
    private Address addressWithoutProvince = AddressFactory.createAddress(123, "Spin St", "Cape Town", "", "8000");
    private Address addressWithoutCountry = AddressFactory.createAddress(123, "Spin St", "Cape Town", "Western Cape", "");
    private Address addressWithoutPostalCode = AddressFactory.createAddress(123, "Spin St", "Cape Town", "Western Cape", "");

    private Address validAddress = AddressFactory.createAddress(123, "Spin St", "Cape Town", "Western Cape", "8000");

    @Test
    void testCreateValidAddress() {
        assertNotNull(validAddress);
        System.out.println(validAddress);
        assertEquals(123, validAddress.getHouseNumber());
        assertEquals("Spin St", validAddress.getStreetName());
        assertEquals("Cape Town", validAddress.getTown());
        assertEquals("Western Cape", validAddress.getCity());
        assertEquals("8000", validAddress.getPostalCode());
    }

    @Test
    void testCreateAddressWithInvalidPostalCode() {
        assertNotNull(addressWithInvalidPostalCode);
        assertNull(addressWithInvalidPostalCode.getPostalCode());
        System.out.println(addressWithInvalidPostalCode);
    }

    @Test
    void testCreateAddressWithoutStreet() {
        assertNotNull(addressWithoutStreet);
        assertEquals("", addressWithoutStreet.getStreetName());
        System.out.println(addressWithoutStreet);
    }

    @Test
    void testCreateAddressWithoutStreetName() {
        assertNotNull(addressWithoutStreetName);
        assertEquals("", addressWithoutStreetName.getStreetName());
        System.out.println(addressWithoutStreetName);
    }

    @Test
    void testCreateAddressWithoutCity() {
        assertNotNull(addressWithoutCity);
        assertEquals("", addressWithoutCity.getTown());
        System.out.println(addressWithoutCity);
    }

    @Test
    void testCreateAddressWithoutProvince() {
        assertNotNull(addressWithoutProvince);
        assertEquals("", addressWithoutProvince.getCity());
        System.out.println(addressWithoutProvince);
    }

    @Test
    void testCreateAddressWithoutCountry() {
        assertNotNull(addressWithoutCountry);
        assertEquals("", addressWithoutCountry.getCity());
        System.out.println(addressWithoutCountry);
    }

    @Test
    void testCreateAddressWithoutPostalCode() {
        assertNotNull(addressWithoutPostalCode);
        assertEquals("", addressWithoutPostalCode.getPostalCode());
        System.out.println(addressWithoutPostalCode);
    }
}
