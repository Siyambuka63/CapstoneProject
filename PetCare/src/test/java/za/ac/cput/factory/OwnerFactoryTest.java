package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Owner;

import java.util.ArrayList;
import java.util.List;


import static org.junit.jupiter.api.Assertions.*;

class OwnerFactoryTest {
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