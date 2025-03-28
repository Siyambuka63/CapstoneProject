package za.ac.cput.factory;
/* Appointment FactoryTest
author: Oluhle Makhaye (222419636)*/

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import za.ac.cput.domain.*;

import java.awt.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class AppointmentFactoryTest {

    ArrayList<MedicalRecord> medicalList = new ArrayList<>(Collections.singletonList(
            MedicalRecordFactory.createMedicalRecord("Arthritis", "Antibiotics tablet")));
    List<Appointment> veterinarianAppointments = new ArrayList<>();
    String urgency = "";
    LocalDate appointmentDate = LocalDate.of(2025, 3, 27);
    LocalTime appointmentTime = LocalTime.of(9, 35, 59);
    Payment payment = PaymentFactory.createPayment("Cash",500.0);
    MedicalRecord medicalRecord = MedicalRecordFactory.createMedicalRecord("","");
    Veterinarian veterinarian = VeterinarianFactory.createVeterinarian(23435, veterinarianAppointments);
    Pet pet= PetFactory.createPet("Mike","Bobby","Pitbull","dog",12,medicalList);

    private Appointment appointment = AppointmentFactory.createAppointment(urgency,appointmentDate,appointmentTime,payment,pet,veterinarian);


    @Test
    void testCreateAppointment() {
        assertNotNull(appointment);
        System.out.println(appointment);

    }


   // private Appointment appointment = AppointmentFactory.createAppointment("critical", LocalDate.of(2025,03,28), LocalTime.of(9,35),270, "Bull Terrior", "Dr Steve");
}
