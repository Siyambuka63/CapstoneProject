package za.ac.cput.domain;

/* Appointment model class
Author: Oluhle Makhaye (222419636)
*/

import java.time.LocalDate;
import java.time.LocalTime;

public class Appointment {
    private String urgency;
    private LocalDate date;
    private LocalTime time;
    private Payment payment;
    private Pet pet;
    private Veterinarian veterinarian;

public Appointment(){}

    public Appointment(Builder builder) {
        this.urgency = builder.urgency;
        this.date = builder.date;
        this.time = builder.time;
        this.payment = builder.payment;
        this.pet = builder.pet;
        this.veterinarian = builder.veterinarian;

    }

    public String getUrgency() {return urgency; }

    public LocalDate getDate() {
            return date;
        }

        public LocalTime getTime() {
            return time;
        }

        public Payment getPayment() {
            return payment;
        }

        public Pet getPet() {
            return pet;
        }

        public Veterinarian getVeterinarian() {
            return veterinarian;
        }

    @Override
    public String toString() {
        return "Appointment{" +
                "urgency='" + urgency + '\'' +
                ", date=" + date +
                ", time=" + time +
                ", payment=" + payment +
                ", pet=" + pet +
                ", veterinarian=" + veterinarian +
                '}';
    }

    public static class Builder {
        public String urgency;
        private LocalDate date;
        private LocalTime time;
        private Payment payment;
        private Pet pet;
        private Veterinarian veterinarian;

        public Builder setUrgency(String urgency) {
            this.urgency = urgency;
            return this;
        }

        public Builder setDate(LocalDate date) {
            this.date = date;
            return this;
        }

        public Builder setTime(LocalTime time) {
            this.time = time;
            return this;
        }

        public Builder setPayment(Payment payment) {
            this.payment = payment;
            return this;
        }

        public Builder setPet(Pet pet) {
            this.pet = pet;
            return this;
        }

        public Builder setVeterinarian(Veterinarian veterinarian) {
            this.veterinarian = veterinarian;
            return this;
        }

        public Appointment build() {
            return new Appointment(this);
        }
    }
}
