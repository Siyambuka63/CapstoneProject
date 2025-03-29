package za.ac.cput.factory;

import za.ac.cput.domain.Address;
import za.ac.cput.domain.Contact;
import za.ac.cput.domain.Pet;
import za.ac.cput.domain.PetOwner;
import za.ac.cput.util.Helper;

import java.util.List;

public class PetOwnerFactory {
    public static PetOwner createPets(String name, Contact contact, Address address, List<Pet> pets) {

        return (PetOwner) new PetOwner.Builder().setPets(pets).
                setName(name).
                setContact(contact).
                setAddress(address).
                build();
    }
}


