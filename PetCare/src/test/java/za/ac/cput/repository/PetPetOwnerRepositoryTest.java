package za.ac.cput.repository;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.domain.PetOwner;
import za.ac.cput.factory.PetOwnerFactory;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class PetPetOwnerRepositoryTest {
 private static PetOwnerRepository repository = PetOwnerRepository.getRepository();
 private PetOwner pets = PetOwnerFactory.createPets("Billy");

    @Test
    void a_create() {
        PetOwner createdPet = repository.create(pets);
        assert createdPet != null;
        System.out.println(createdPet.toString());
    }

    @Test
    void b_read() {
        PetOwner read = repository.read(pets.getIndex());
        assert read != null;
    }

    @Test
    void c_update() {
        PetOwner updatedPet = new PetOwner.Builder().setPets("Billy").build();
        PetOwner updatedPet2 = repository.update(updatedPet);
        assert updatedPet2 != null;
        System.out.println(updatedPet2.toString());
    }

    @Test
    void d_delete() {
        PetOwner deletedPet = repository.delete(pets.getIndex());
        assert deletedPet != null;
        System.out.println("Pet deleted successfully!");
    }

    @Test
    void e_getAll() {
        System.out.println(repository.getAll());
    }
}