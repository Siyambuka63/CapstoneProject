/*
ContactFactoryTest.java
Contact Factory Test class
Author: Nkheso Mathebula 230762883
*/
package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Contact;

import static org.junit.jupiter.api.Assertions.*;

class ContactFactoryTest {

    private Contact contactWithInvalidPhoneNumber = ContactFactory.createContact("", "angu@gmail.com");
    private Contact contactWithInvalidEmail = ContactFactory.createContact("0836431131", "");
    private Contact contactWithNegativePhoneNumber = ContactFactory.createContact("-0836431131", "angu@gmail.com");
    private Contact contactWithValidDetails = ContactFactory.createContact("0836431131", "angu@gmail.com");

    @Test
    void testCreateContactWithValidDetails() {
        assertNotNull(contactWithValidDetails);
        System.out.println(contactWithValidDetails);
    }

    @Test
    void testCreateContactWithInvalidPhoneNumber() {
        assertNotNull(contactWithInvalidPhoneNumber);
        System.out.println(contactWithInvalidPhoneNumber);
    }

    @Test
    void testCreateContactWithInvalidEmail() {
        assertNotNull(contactWithInvalidEmail);
        System.out.println(contactWithInvalidEmail);
    }

    @Test
    void testCreateContactWithNegativePhoneNumber() {
        assertNotNull(contactWithNegativePhoneNumber);
        System.out.println(contactWithNegativePhoneNumber);
    }

    @Test
    void testCreateContactWithoutPhoneNumber() {
        assertThrows(IllegalArgumentException.class, () -> ContactFactory.createContact("", "angu@gmail.com"));
    }

    @Test
    void testCreateContactWithoutEmail() {
        assertThrows(IllegalArgumentException.class, () -> ContactFactory.createContact("0836431131", ""));
    }
}
