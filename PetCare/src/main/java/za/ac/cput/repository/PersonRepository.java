package za.ac.cput.repository;

import za.ac.cput.domain.Person;

import java.util.ArrayList;
import java.util.List;

public class PersonRepository implements IPersonRepository {

    private static PersonRepository repository = null;

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
    public List<Person> getAll(Person person) {

        return null;
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
        delete(oldPerson.getName());
        create(person);
        return null;
    }

    @Override
    public Person delete(String name) {
        Person person = read(name);
        if (people.remove(person)) {
            return person;
        }
        return null;
    }
}
