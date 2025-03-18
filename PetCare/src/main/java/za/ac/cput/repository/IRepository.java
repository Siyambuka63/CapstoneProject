package za.ac.cput.repository;

public interface IRepository<Type, id> {
    Type create(Type t);

    Type read(id id);

    Type update(Type t);

    Type delete(id id);
}
