package za.ac.cput.repository;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.domain.Owner;
import za.ac.cput.factory.OwnerFactory;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class OwnerRepositoryTest {
 private static OwnerRepository repository = OwnerRepository.getRepository();
 private Owner pets = OwnerFactory.createPets("Billy");

    @Test
    void a_create() {
        Owner createdPet = repository.create(pets);
        assert createdPet != null;
        System.out.println(createdPet.toString());
    }

    @Test
    void b_read() {
        Owner read = repository.read(pets.getIndex());
        assert read != null;
    }

    @Test
    void c_update() {
        Owner updatedPet = new Owner.Builder().setPets("Billy").build();
        Owner updatedPet2 = repository.update(updatedPet);
        assert updatedPet2 != null;
        System.out.println(updatedPet2.toString());
    }

    @Test
    void d_delete() {
        Owner deletedPet = repository.delete(pets.getIndex());
        assert deletedPet != null;
        System.out.println("Pet deleted successfully!");
    }

    @Test
    void e_getAll() {
        System.out.println(repository.getAll());
    }
}