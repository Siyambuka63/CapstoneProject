package za.ac.cput.factory;

import za.ac.cput.domain.Owner;
import za.ac.cput.util.Helper;

    public class OwnerFactory {
        public static Owner createPets(String pets) {
            if (Helper.isNullorEmpty(pets))
                return null;

//    public static Owner removePets(String pets) {
//        if (!Helper.isNullorEmpty(pets))
//            return null;
//        }
            return new Owner.Builder()
                    .setPets(pets)
                    .build();
        }
    }


