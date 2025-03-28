package za.ac.cput.factory;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class PetPetOwnerFactoryTest {
    List<String> pets = new ArrayList<>();

    @Test
    public void testCreatePets(){
        assert pets != null;
        System.out.println(pets);
    }
    @Test
    public void testRemovePets(){
        pets.clear();
    }
}