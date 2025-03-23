/* PersonRepository.java
Person repository class
Author: Siyambuka Mbali (230594646)
Date: 23 March 2025
*/

package za.ac.cput.repository;

import za.ac.cput.domain.Person;

import java.util.ArrayList;
import java.util.List;

public class PersonRepository implements IRepository<Person, String> {

    private static PersonRepository repository;

    private List<Person> people;

    private PersonRepository() {
        people = new ArrayList<Person>();
    }

    public static PersonRepository getRepository() {
        if (repository == null) {
            repository = new PersonRepository();
        }
        return repository;
    }

    @Override
    public Person create(Person person) {
        if (people.add(person)) {
            return person;
        }
        return null;
    }

    @Override
    public Person read(String name) {
        for (Person person : people) {
            if (person.getName().equals(name)) {
                return person;
            }
        }
        return null;
    }

    @Override
    public Person update(Person person) {
        Person oldPerson = read(person.getName());
        if (oldPerson == null) {
            return null;
        }
        Person deletedPerson = delete(oldPerson.getName());
        if (deletedPerson == null) {
            return null;
        }
        return create(person);
    }

    @Override
    public Person delete(String name) {
        Person person = read(name);
        if (person == null) {
            return null;
        }
        if (people.remove(person)) {
            return person;
        }
        return null;
    }

    @Override
    public List<Person> getAll() {
        return people;
    }
}
