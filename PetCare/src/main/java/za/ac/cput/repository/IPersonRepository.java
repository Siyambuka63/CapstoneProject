package za.ac.cput.repository;

import za.ac.cput.domain.Person;

import java.util.List;

public interface IPersonRepository extends IRepository<Person, String>{
    List<Person> getAll(Person person);
}
