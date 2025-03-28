package za.ac.cput.domain;

import java.util.List;

public class PetOwner extends Person {
    private List<Pet> pets;

    private PetOwner() {
        super();
    }

    private PetOwner(Builder builder) {
        super(builder);
        this.pets = builder.pets;
    }

    public List<Pet> getPets() {
        return pets;
    }


    public static class Builder extends Person.Builder {
        private List<Pet> pets;

        public Builder setPets(List<Pet> pets) {
            this.pets = pets;
            return this;
        }

        public PetOwner build() {
            return new PetOwner(this);
        }
    }

}
