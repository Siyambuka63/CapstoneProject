/* PersonRepositoryTest.java
Person repository test class
Author: Siyambuka Mbali (230594646)
Date: 23 March 2025
*/

package za.ac.cput.repository;

import org.junit.jupiter.api.*;
import za.ac.cput.domain.Address;
import za.ac.cput.domain.Contact;
import za.ac.cput.domain.Person;
import za.ac.cput.factory.AddressFactory;
import za.ac.cput.factory.ContactFactory;
import za.ac.cput.factory.PersonFactory;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class PersonRepositoryTest {

    private static PersonRepository personRepository = PersonRepository.getRepository();

    private static Contact contact = ContactFactory.createContact("0836431131", "angu@gmail.com");
    private static Address address = AddressFactory.createAddress(123, "Spin St", "Cape Town", "Western Cape", "8000");
    private static Person person = PersonFactory.createPerson("Joe", contact, address);

    @Test
    @Order(1)
    void create() {
        Person createdPerson = personRepository.create(person);
        assertNotNull(createdPerson);
        System.out.println(createdPerson);
    }

    @Test
    @Order(2)
    void read() {
        Person readPerson = personRepository.read(person.getName());
        assertNotNull(readPerson);
        System.out.println(readPerson);
    }

    @Test
    @Order(3)
    void update() {
        Contact newContact = ContactFactory.createContact("0987654321", "person@gmail.com");
        Person newPerson = PersonFactory.createPerson("Joe", newContact, address);
        Person updatedPerson = personRepository.update(newPerson);
        assertNotNull(updatedPerson);
        System.out.println(updatedPerson);
    }

    @Test
    @Order(4)
    void delete() {
        Person deletedPerson = personRepository.delete(person.getName());
        assertNotNull(deletedPerson);
        System.out.println(deletedPerson);
    }

    @Test
    @Order(5)
    void getAll() {
        List<Person> personList = personRepository.getAll();
        assertNotNull(personList);
        System.out.println(personList);
    }
}