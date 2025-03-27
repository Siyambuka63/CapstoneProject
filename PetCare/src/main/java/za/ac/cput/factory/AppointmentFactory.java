package za.ac.cput.factory;

import za.ac.cput.domain.Appointment;
import za.ac.cput.domain.Payment;
import za.ac.cput.domain.Pet;
import za.ac.cput.domain.Veterinarian;
import za.ac.cput.util.Helper;

import java.time.LocalDate;
import java.time.LocalTime;

public class AppointmentFactory {
    public static Appointment createAppointment(LocalDate date, LocalTime time, Payment payment, Pet pet, Veterinarian veterinarian) {
        if (!Helper.isValidDate(date)) return null;
        if (!Helper.isValidTime(time)) return null;
        if (payment == null) return null;
        if (pet == null) return null;
        if (veterinarian == null) return null;
        return new Appointment.Builder().setPayment(payment)
                .setPet(pet).setVeterinarian(veterinarian)
                .build();

    }
}
