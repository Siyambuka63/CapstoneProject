package za.ac.cput.factory;

import za.ac.cput.domain.MedicalRecord;
import za.ac.cput.domain.Owner;
import za.ac.cput.domain.Pet;
import za.ac.cput.util.Helper;

import java.util.ArrayList;
/* PetFactory.java
PetFactory model class
Author: Sinovuyo Mathungana (230143725)
Date: 28 March 2025
 */
public class PetFactory {
  public static Pet createPet(String owner,
                              String name,
                              String breed,
                              String species,
                              int age,
                              ArrayList<MedicalRecord> medicalRecord){
      if (Helper.isNull(owner)) return null;
      if (Helper.isNullOrEmpty(name)) return null;
      if (Helper.isNullOrEmpty(breed)) return null;
      if (Helper.isNullOrEmpty(species)) return null;
      if (!Helper.isAgeValid(age)) return null;
      if (Helper.isNull(medicalRecord)) return null;
      return new Pet.Builder()
              .setOwner(owner)
              .setName(name)
              .setBreed(breed).
              setSpecies(species).
              setAge(age).
              setMedicalHistory(medicalRecord).
              build();

  }
}
