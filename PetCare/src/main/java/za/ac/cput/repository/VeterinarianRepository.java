/* VeterinarianTRepository.java
Veterinarian repository class
Author: Athenkosi Mekana(222319437)
Date: 28 March 2025
 */




package za.ac.cput.repository;

import za.ac.cput.domain.Veterinarian;
import java.util.ArrayList;
import java.util.List;

public class VeterinarianRepository implements IRepository<Veterinarian, String> {

    private static VeterinarianRepository repository;
    private List<Veterinarian> veterinarians;

    private VeterinarianRepository() {
        veterinarians = new ArrayList<Veterinarian>();
    }

    public static VeterinarianRepository getRepository() {
        if (repository == null) {
            repository = new VeterinarianRepository();
        }
        return repository;
    }

    @Override
    public Veterinarian create(Veterinarian veterinarian) {
        if (veterinarians.add(veterinarian)) {
            return veterinarian;
        }
        return null;
    }

    @Override
    public Veterinarian read(String veterinarianId) {
        for (Veterinarian veterinarian : veterinarians) {
            if (veterinarian.getVeterinarianId().equals(veterinarianId)) {
                return veterinarian;
            }
        }
        return null;
    }

    @Override
    public Veterinarian update(Veterinarian veterinarian) {
        Veterinarian previousVeterinarian = read(veterinarian.getVeterinarianId());
        if (previousVeterinarian == null) {
            return null;
        }
        
        veterinarians.remove(previousVeterinarian);
        veterinarians.add(veterinarian);
        return veterinarian;
    }

    @Override
    public Veterinarian delete(String veterinarianId) {
        Veterinarian veterinarian = read(veterinarianId);
        if (veterinarian == null) {
            return null;
        }
        if (veterinarians.remove(veterinarian)) {
            return veterinarian;
        }
        return null;
    }

    @Override
    public List<Veterinarian> getAll() {
        return veterinarians;
    }
}
