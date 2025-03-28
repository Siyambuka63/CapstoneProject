package za.ac.cput.repository;

import za.ac.cput.domain.MedicalRecord;
import za.ac.cput.domain.Person;
import za.ac.cput.domain.Pet;
import za.ac.cput.factory.MedicalRecordFactory;
import za.ac.cput.factory.PetFactory;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import java.util.ArrayList;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;
/* PetRepositoryTest.java
PetRepositoryTest model class
Author: Sinovuyo Mathungana (230143725)
Date: 28 March 2025
 */
@TestMethodOrder(MethodOrderer.MethodName.class)
class PetRepositoryTest {
  private static  PetRepository repository = PetRepository.getRepository();
  private ArrayList<MedicalRecord> medicalList = new ArrayList<>(Collections.singletonList(
          MedicalRecordFactory.createMedicalRecord("Tuberculosis", "Antibiotics tablet")));
  private Pet pets = PetFactory.createPet(null,"Jimmy","Pit Bull","Dog",5,medicalList);
    @Test
    void a_create() {
      Pet pet = repository.create(pets);
      assertNotNull(pet);
      System.out.println(pet);
    }

    @Test
    void b_read() {
      Pet read = repository.read(pets.getName());
      assertNotNull(read);
      System.out.println(read);
    }

    @Test
    void c_update() {
      Pet newPet = new Pet.Builder().copy(pets).setBreed("Dalmatian").build();
      Pet updated = repository.update(newPet);
      assertNotNull(updated);
      System.out.println(updated.toString());
    }

    @Test
    void d_delete() {
      Pet deletedPet = repository.delete(pets.getName());
      assertNotNull(deletedPet);
      System.out.println(deletedPet);
    }

    @Test
    void e_getAll() {
      System.out.println(repository.getAll());
    }
}