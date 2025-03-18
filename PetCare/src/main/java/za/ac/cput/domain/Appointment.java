package za.ac.cput.domain;

import java.time.LocalDate;
import java.time.LocalTime;

public class Appointment {
    private LocalDate date;
    private LocalTime time;
    private Payment payment;
    /*private Pet pet;
    private Veterinarian veterinarian;*/

public Appointment(){}

    public Appointment(Builder builder) {
        this.date = builder.date;
        this.time = builder.time;
        this.payment = builder.payment;
        //this.pet = builder.pet;
       // this.veterinarian = builder.veterinarian;

    }

    public LocalDate getDate() {
            return date;
        }

        public LocalTime getTime() {
            return time;
        }

        public Payment getPayment() {
            return payment;
        }

     /*   public Pet getPet() {
            return pet;
        }

        public Veterinarian getVeterinarian() {
            return veterinarian;
        } */

    @Override
    public String toString() {
        return "Appointment{" +
                "date=" + date +
                ", time=" + time +
                ", payment=" + payment +
                '}';
    }

    /* @Override
    public String toString() {
        return "Appointment{" +
                "date=" + date +
                ", time=" + time +
                ", payment=" + payment +
                ", pet=" + pet +
                ", veterinarian=" + veterinarian +
                '}';
    }*/

    public static class Builder {
        private LocalDate date;
        private LocalTime time;
        private Payment payment;
       // private Pet pet;
        //private veterinarian veterinarian;

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

      /*  public Builder setPet(Pet pet) {
            this.pet = pet;
            return this;
        }

        public Builder setVeterinarian(Veterinarian veterinarian) {
            this.veterinarian = veterinarian;
            return this;
        } */

    }
}
