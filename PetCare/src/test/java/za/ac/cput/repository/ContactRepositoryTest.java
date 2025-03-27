package za.ac.cput.repository;

import org.junit.jupiter.api.*;
import za.ac.cput.domain.Contact;
import za.ac.cput.factory.ContactFactory;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class ContactRepositoryTest {

    private static ContactRepository contactRepository = ContactRepository.getRepository();

    private static Contact contact = ContactFactory.createContact("0836431131", "angu@gmail.com", "0604357200");

    @Test
    @Order(1)
    void create() {
        Contact createdContact = contactRepository.create(contact);
        assertNotNull(createdContact);
        System.out.println("Created Contact: " + createdContact);
    }

    @Test
    @Order(2)
    void read() {
        assertNotNull(contact, "Contact must be created first before reading.");
        Contact readContact = contactRepository.read(contact.getContactId());
        assertNotNull(readContact);
        assertEquals(contact.getContactId(), readContact.getContactId());
        System.out.println("Read Contact: " + readContact);
    }

    @Test
    @Order(3)
    void update() {
        assertNotNull(contact, "Contact must be created first before updating.");
        Contact updatedContact = new Contact.Builder()
                .setContactId(contact.getContactId())
                .setPhoneNumber("0836431131")
                .setEmail("angu@gmail.com.com")
                .setAlternateNumber("0604357200")
                .build();
        Contact result = contactRepository.update(updatedContact);
        assertNotNull(result);
        assertEquals("0836431131", result.getPhoneNumber());
        System.out.println("Updated Contact: " + result);
    }

    @Test
    @Order(4)
    void delete() {
        assertNotNull(contact, "Contact must be created first before delete is called.");
        Contact deletedContact = contactRepository.delete(contact.getContactId());
        assertNotNull(deletedContact, "Contact deletion failed. Contact could not be found or deleted.");
        System.out.println("Deleted Contact: " + deletedContact);
    }

    @Test
    @Order(5)
    void getAll() {
        List<Contact> contacts = contactRepository.getAll();
        assertNotNull(contacts);
        System.out.println("All Contacts: " + contacts);
    }
}