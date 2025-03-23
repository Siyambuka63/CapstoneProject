/* PersonFactoryTest.java
Person factory test class
Author: Siyambuka Mbali (230594646)
Date: 23 March 2025
*/

package za.ac.cput.factory;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Person;

import static org.junit.jupiter.api.Assertions.*;

class PersonFactoryTest {

    //TODO add value for contact and address
    private Person personWithoutName = PersonFactory.createPerson("", null, null);

    //TODO add value for address
    private Person personWithoutContact = PersonFactory.createPerson("Joe", null, null);

    //TODO add value for contact
    private Person personWithoutAddress = PersonFactory.createPerson("Joe", null, null);

    //TODO add value for contact and address
    private Person person = PersonFactory.createPerson("Joe", null, null);

    @Test
    @Disabled
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
    @Disabled
    void testCreatePersonWithoutAddress() {
        assertNotNull(personWithoutAddress);
        System.out.println(personWithoutAddress);
    }
}