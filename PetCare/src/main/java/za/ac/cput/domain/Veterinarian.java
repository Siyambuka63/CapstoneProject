/* Veterinarian.java
Veterinarian domain class
Author: Athenkosi Mekana(222319437)
Date: 28 March 2025
 */

package za.ac.cput.domain;
import java.util.List;

public class Veterinarian {

    private int veterinarianId;

    private List appointments;

    private Veterinarian() {
    }
    private Veterinarian(Builder builder) {
        this.veterinarianId = builder.veterianrianId;
        this.appointments = builder.appointments;

}
public int getVeterinarianId() {
    return veterinarianId;
}

    public List getAppointments() {
        return appointments;
    }

    @Override
    public String toString() {
        return "Veterinarian{" +
                "veterinarianId=" + veterinarianId +
                ", appointments=" + appointments +
                '}';
    }
    public static class Builder {
        private int veterianrianId;
        private List appointments;


        public Builder setVeterinarianId(int veterinarianId) {
            this.veterianrianId = veterinarianId;
            return this;
        }

        public Builder setAppointments(List appointments) {
            this.appointments = appointments;
            return this;

        }

        public Builder copy(Veterinarian veterinarian) {
            this.veterianrianId = veterinarian.veterinarianId;
            this.appointments = veterinarian.appointments;
            return this;

        }
        public Veterinarian build() {
            return new Veterinarian(this);

        }
    }
}












