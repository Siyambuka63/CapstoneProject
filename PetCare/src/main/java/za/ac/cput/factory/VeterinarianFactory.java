/* VeterinarianFactory.java
Veterinarian factory class
Author: Athenkosi Mekana(222319437)
Date: 28 March 2025
 */


package za.ac.cput.factory;

import za.ac.cput.domain.Veterinarian;
import za.ac.cput.util.Helper;

import java.util.ArrayList;
import java.util.List;



public class VeterinarianFactory {
    public static Veterinarian createVeterinarian(int veterinarianId, List appointments) {
    if(veterinarianId == 0 )
        return null;
    if(appointments == null)
        return null;
    return new Veterinarian.Builder().setVeterinarianId(veterinarianId).setAppointments(appointments).build();
    }
}

