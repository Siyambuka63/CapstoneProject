package za.ac.cput.repository;

import za.ac.cput.domain.PetOwner;

import java.util.ArrayList;
import java.util.List;

public class PetOwnerRepository implements IRepository<PetOwner, String> {
    private static PetOwnerRepository pets = null;

    private List<PetOwner> petList;

    private PetOwnerRepository() {
        petList = new ArrayList<PetOwner>();
    }

    public static PetOwnerRepository getRepository() {
        if (pets == null) {
            pets = new PetOwnerRepository();
        }
        return pets;
    }

    @Override
    public PetOwner create(PetOwner pets) {
        boolean success = petList.add(pets);
        if (petList.add(pets)) {
            return pets;
        }
        return null;
    }

    @Override
    public PetOwner read(String name) {
        for (PetOwner pet : petList) {
            if (pet.getName().equals(name)) {
                return pet;
            }
        }
        return null;
    }

    @Override
    public PetOwner update(PetOwner pets) {
        String name = pets.getName();
        PetOwner oldPet = read(name);
        if (oldPet == null)
            return null;

        boolean success = petList.remove(oldPet);
        if (success) {
            if (petList.add(pets))
                return pets;
        }
        return null;
    }

    @Override
    public PetOwner delete(String name) {
        PetOwner pets = read(name);
        if (pets == null) {
            return null;
        }
        if (petList.remove(pets)) {
            return pets;
        }
        return null;
    }

    @Override
    public List<PetOwner> getAll() {
        return petList;
    }

}
