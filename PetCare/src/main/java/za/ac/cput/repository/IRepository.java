package za.ac.cput.repository;

import java.util.List;

public interface IRepository<Type, id> {
    Type create(Type type);

    Type read(id id);

    Type update(Type type);

    Type delete(id id);

    List<Type> getAll();
}
