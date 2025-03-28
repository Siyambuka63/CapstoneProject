/* VeterinarianFactoryTest.java
Veterinarian Factory test class
Author: Athenkosi Mekana(222319437)
Date: 28 March 2025
 */




package za.ac.cput.factory;
import org.junit.jupiter.api.*;
import za.ac.cput.domain.Veterinarian;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

class VeterinarianFactoryTest {



    @Test

    public void testCreateVeterinarian() {
        int veterinarianId = 1;
        List<String> appointments = new ArrayList<>();
        appointments.add("2025-03-28 10:00");
        Veterinarian veterinarian = VeterinarianFactory.createVeterinarian(veterinarianId, appointments);
        assertNotNull(veterinarian);
        assertEquals(veterinarianId, veterinarian.getVeterinarianId());
    }
    @Test
    public void testCreateVeterinarianWithValidId() {
        int veterinarianId = 6554;
        List<String> appointments = new ArrayList<>();
        appointments.add("2025-03-28 14:00");
        Veterinarian veterinarian = VeterinarianFactory.createVeterinarian(veterinarianId, appointments);
        assertNotNull(veterinarian);
        assertEquals(6554, veterinarian.getVeterinarianId());


    }
    @Test
    public void testCreateVeterinarianWithInvalidId() {
        int veterinarianId = 0; // Invalid ID
        List<String> appointments = new ArrayList<>();
        Veterinarian veterinarian = VeterinarianFactory.createVeterinarian(veterinarianId, appointments);
        assertNull(veterinarian);
    }
    @Test
    public void createVeterinarianWithAppointments() {
        int veterinarianId = 2;
        List<String> appointments = new ArrayList<>();
        appointments.add("2025-03-29 09:00");
        appointments.add("2025-03-30 11:00");
        Veterinarian veterinarian = VeterinarianFactory.createVeterinarian(veterinarianId, appointments);
        assertNotNull(veterinarian);
        assertEquals(2, veterinarian.getAppointments().size());
    }
    @Test
    public void testCreateVeterinarianWithInvalidAppointments() {
    fail();
    }
    @Test
    @Disabled
    public void testNotImplemented() {

    }

}
