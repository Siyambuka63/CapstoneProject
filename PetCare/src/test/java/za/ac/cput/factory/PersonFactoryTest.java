/* PersonFactoryTest.java
Person factory test class
Author: Siyambuka Mbali (230594646)
Date: 23 March 2025
*/

package za.ac.cput.factory;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Address;
import za.ac.cput.domain.Contact;
import za.ac.cput.domain.Person;

import static org.junit.jupiter.api.Assertions.*;

class PersonFactoryTest {
    private Contact contact = ContactFactory.createContact("0836431131", "angu@gmail.com");
    private Address address = AddressFactory.createAddress(123, "Spin St", "Cape Town", "Western Cape", "8000");
    private Person personWithoutName = PersonFactory.createPerson("", contact, address);
    private Person personWithoutContact = PersonFactory.createPerson("Joe", null, address);
    private Person personWithoutAddress = PersonFactory.createPerson("Joe", contact, null);

    //TODO add value for contact and address
    private Person person = PersonFactory.createPerson("Joe", contact, address);

    @Test
    void testCreatePerson() {
        assertNotNull(person);
        System.out.println(person);
    }

    @Test
    void testCreatePersonWithoutName() {
        assertNotNull(personWithoutName);
        System.out.println(personWithoutName);
    }

    @Test
    @Disabled
    void testCreatePersonWithoutContact() {
        assertNotNull(personWithoutContact);
        System.out.println(personWithoutContact);
    }

    @Test
    void testCreatePersonWithoutAddress() {
        assertNotNull(personWithoutAddress);
        System.out.println(personWithoutAddress);
    }
}