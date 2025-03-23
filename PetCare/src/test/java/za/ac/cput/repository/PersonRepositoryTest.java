/* PersonRepositoryTest.java
Person repository test class
Author: Siyambuka Mbali (230594646)
Date: 23 March 2025
*/

package za.ac.cput.repository;

import org.junit.jupiter.api.*;
import za.ac.cput.domain.Person;
import za.ac.cput.factory.PersonFactory;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class PersonRepositoryTest {

    private static PersonRepository personRepository = PersonRepository.getRepository();

    //ToDo Add contact and address
    private static Person person = PersonFactory.createPerson("Joe", null, null);

    @Test
    @Order(1)
    @Disabled
    void create() {
        Person createdPerson = personRepository.create(person);
        assertNotNull(createdPerson);
        System.out.println(createdPerson);
    }

    @Test
    @Order(2)
    @Disabled
    void read() {
        Person readPerson = personRepository.read(person.getName());
        assertNotNull(readPerson);
        System.out.println(readPerson);
    }

    @Test
    @Order(3)
    @Disabled
    void update() {
        //ToDo Change Contact or Address
        Person newPerson = PersonFactory.createPerson("Joe", null, null);
        Person updatedPerson = personRepository.update(newPerson);
        assertNotNull(updatedPerson);
        System.out.println(updatedPerson);
    }

    @Test
    @Order(4)
    @Disabled
    void delete() {
        Person deletedPerson = personRepository.delete(person.getName());
        assertNotNull(deletedPerson);
        System.out.println(deletedPerson);
    }

    @Test
    @Order(5)
    @Disabled
    void getAll() {
        List<Person> personList = personRepository.getAll();
        assertNotNull(personList);
        System.out.println(personList);
    }
}