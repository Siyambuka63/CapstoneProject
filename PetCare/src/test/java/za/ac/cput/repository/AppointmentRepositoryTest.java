package za.ac.cput.repository;

/* AppointmentRepositoryTest
author: Oluhle Makhaye (222419636)
Date: 28 March 2025*/

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import za.ac.cput.domain.*;
import za.ac.cput.factory.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class AppointmentRepositoryTest {

    private static AppointmentRepository appointmentRepository = AppointmentRepository.getRepository();
    private static AppointmentFactory AppoinmentFactory;

    ArrayList<MedicalRecord> medicalList = new ArrayList<>(Collections.singletonList(
            MedicalRecordFactory.createMedicalRecord("Arthritis", "Antibiotics tablet")));
    List<Appointment> veterinarianAppointments = new ArrayList<>();
    Payment payment = PaymentFactory.createPayment("EFT",500);
    Pet pet = PetFactory.createPet("Mike","Bobby","Pitbull","dog",12,medicalList);
    Veterinarian veterinarian = VeterinarianFactory.createVeterinarian(23435, veterinarianAppointments);

    private Appointment appointment = AppoinmentFactory.createAppointment("Critical", LocalDate.of(2025,03,27), LocalTime.of(9, 35, 54),payment,pet,veterinarian);

    @Test
    void create() {
        Appointment createdAppointment = appointmentRepository.create(appointment);
        assertNotNull(appointment);
        System.out.println(appointment);
    }

    @Test
    void read() {
        Appointment readAppointment = appointmentRepository.read(appointment.getUrgency());
        assertNotNull(readAppointment);
        System.out.println(readAppointment);
    }

    @Test
    void update() {
        Appointment updatedAppointment = appointmentRepository.update(appointment);
        assertNotNull(updatedAppointment);
        System.out.println(updatedAppointment);
    }

    @Test
    void delete() {
        Appointment appointmentToDelete = appointmentRepository.delete(appointment.getUrgency());
        assertNotNull(appointmentToDelete);
        System.out.println(appointmentToDelete);
    }

    @Test
    void getAll() {
        List<Appointment> appointments = appointmentRepository.getAll();
        assertNotNull(appointments);
        System.out.println(appointments);
    }

    /* @Test
    void create(){
        Appointment createdAppointment = appointmentRepository.create(appointment);
        assertNotNull(appointment);
        System.out.println(appointment);

        void read() {
            Appointment readAppointment = appointmentRepository.read(appointment.getUrgency());
            assertNotNull(readAppointment);
            System.out.println(readAppointment);
        }*/

}
