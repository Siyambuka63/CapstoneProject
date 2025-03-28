package za.ac.cput.repository;

import za.ac.cput.domain.Pet;
import java.util.ArrayList;
import java.util.List;
/* PetRepository.java
PetRepository model class
Author: Sinovuyo Mathungana (230143725)
Date: 28 March 2025
 */
public class PetRepository implements IRepository<Pet, String>{
    private static PetRepository repository = null;

    private List<Pet> pets;

    private PetRepository() {
        pets = new ArrayList<Pet>();
    }

    public static PetRepository getRepository() {
        if (repository == null) {
            repository = new PetRepository();
        }
        return repository;
    }

    @Override
    public Pet create(Pet pet) {
        if (pets.add(pet)) {
            return pet;
        }
        return null;
    }

    @Override
    public Pet read(String name) {
        for (Pet pet : pets) {
            if (pet.getName().equals(name)) {
                return pet;
            }
        }
        return null;
    }

    @Override
    public Pet update(Pet pet) {
        Pet oldPet = read(pet.getName());
        if (oldPet == null) {
            return null;
        }
        Pet deletedPet = delete(oldPet.getName());
        if (deletedPet == null) {
            return null;
        }
        return create(pet);
    }

    @Override
    public Pet delete(String name) {
        Pet pet = read(name);
        if (pet == null) {
            return null;
        }
        if (pets.remove(pet)) {
            return pet;
        }
        return null;
    }

    @Override
    public List<Pet> getAll() {
        return pets;
    }
}
