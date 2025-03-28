package za.ac.cput.repository;

import za.ac.cput.domain.Owner;
import za.ac.cput.domain.Person;

import java.util.ArrayList;
import java.util.List;

public class OwnerRepository  implements IRepository<Owner, String> {
    private static OwnerRepository pets = null;

    private List<Owner> petList;

    private OwnerRepository() {
        petList = new ArrayList<Owner>();
    }

    public static OwnerRepository getRepository() {
        if (pets == null) {
            pets = new OwnerRepository();
        }
        return pets;
    }

    @Override
    public Owner create(Owner pets) {
        boolean success = petList.add(pets);
        if (petList.add(pets)) {
            return pets;
        }
        return null;
    }

    @Override
    public Owner read(String id) {
        for (Owner pet : petList) {
            if (pet.getIndex().equals(id)) {
                return pet;
            }
        }
        return null;
    }

    @Override
    public Owner update(Owner pets) {
        String id = pets.getIndex();
        Owner oldPet = read(id);
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
    public Owner delete(String id) {
        Owner pets = read(id);
        if (pets == null) {
            return null;
        }
        if (petList.remove(pets)) {
            return pets;
        }
        return null;
    }

    @Override
    public List<Owner> getAll() {
        return petList;
    }

}
