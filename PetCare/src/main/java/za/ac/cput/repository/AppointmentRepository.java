/*package za.ac.cput.repository;

import za.ac.cput.domain.Appointment;

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
    public Appointment read(LocalDate Date) {
        for (Appointment appointment : appointments) {
            if(appointment.getDate().equals(Date)) {
                return appointment;
            }
        }
        return null;
    }

    @Override
    public Appointment update(Appointment appointment) {
        return null;
    }

    @Override
    public Appointment delete(String s) {
        return null;
    }

    @Override
    public List<Appointment> getAll() {
        return List.of();
    }
}*/
