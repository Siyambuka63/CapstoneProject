package za.ac.cput.repository;

import za.ac.cput.domain.Appointment;
import za.ac.cput.domain.Payment;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class AppointmentRepository implements IRepository<Appointment, String>{

    private static AppointmentRepository repository;

    private List<Appointment> appointments;

    private AppointmentRepository() {
        appointments = new ArrayList<>();
    }

    public static AppointmentRepository getRepository() {
        if (repository == null) {
            repository = new AppointmentRepository();
        }
        return repository;
    }


    @Override
    public Appointment create(Appointment appointment) {
        if (appointments.add(appointment)) {
            return appointment;
        }
        return null;
    }

    @Override
    public Appointment read(String Urgency) {
        for (Appointment appointment : appointments) {
            if(appointment.getUrgency().equals(Urgency)) {
                return appointment;
            }
        }
        return null;
    }

    @Override
    public Appointment update(Appointment appointment) {
        Appointment oldAppointment = read(appointment.getUrgency());
        if (oldAppointment != null) {
            return appointment;
        }
        return null;
    }

    @Override
    public Appointment delete(String Urgency) {
        Appointment appointment = read(Urgency);
        if (appointment != null) {
            appointments.remove(appointment);
            return appointment;
        }
        return null;
    }

    @Override
    public List<Appointment> getAll() {
        return appointments;
    }
}
