package za.ac.cput.repository;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.domain.Veterinarian;
import za.ac.cput.factory.VeterinarianFactory;
import za.ac.cput.repository.VeterinarianRepository;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

/* VeterinarianRepositoryTest.java
   VeterinarianRepository test class
   Author:Athenkosi Mekana
   222319437
   Date: 28 March 2025
*/

@TestMethodOrder(MethodOrderer.MethodName.class)
class VeterinarianRepositoryTest {
    private static final VeterinarianRepository repository = VeterinarianRepository.getRepository();
    private static final Veterinarian veterinarian = VeterinarianFactory.createVeterinarian("VET123", "Dr. Smith", "Cardiology");

    @Test
    @Order(1)
    void a_create() {
        Veterinarian created = repository.create(veterinarian);
        assertNotNull(created);
        System.out.println("Created Veterinarian: " + created);
    }

    @Test
    @Order(2)
    void b_read() {
        Veterinarian read = repository.read(veterinarian.getVeterinarianId());
        assertNotNull(read);
        System.out.println("Read Veterinarian: " + read);
    }

    @Test
    @Order(3)
    void c_update() {
        Veterinarian updatedVeterinarian = new Veterinarian.Builder()
                .copy(veterinarian)
                .setName("Dr. John Smith")
                .setSpecialization("Surgery")
                .build();
        Veterinarian updated = repository.update(updatedVeterinarian);
        assertNotNull(updated);
        System.out.println("Updated Veterinarian: " + updated);
    }

    @Test
    @Order(4)
    void d_delete() {
        Veterinarian deletedVeterinarian = repository.delete(veterinarian.getVeterinarianId());
        assertNotNull(deletedVeterinarian);
        System.out.println("Deleted Veterinarian: " + deletedVeterinarian);
    }

    @Test
    @Order(5)
    void e_getAll() {
        System.out.println("All Veterinarians: " + repository.getAll());
    }
}
