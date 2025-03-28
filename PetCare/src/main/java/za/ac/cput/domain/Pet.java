package za.ac.cput.domain;

import java.util.ArrayList;

public class Pet {
    private  String owner;
    private  String name;
    private  String breed;
    private  String species;
    private  int age;
    private ArrayList<MedicalRecord> medicalHistory;

    private Pet() {

    }

    private Pet(Builder builder){
      this.owner = builder.owner;
      this.name = builder.name;
      this.breed = builder.breed;
      this.species = builder.species;
      this.age = builder.age;
      this.medicalHistory = builder.medicalHistory;
    }

    public String getOwner() {
        return owner;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public String getSpecies() {
        return species;
    }

    public int getAge() {
        return age;
    }

    public ArrayList<MedicalRecord> getMedicalHistory() {
        return medicalHistory;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "owner=" + owner +
                ", name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", species='" + species + '\'' +
                ", age=" + age +
                ", medicalHistory=" + medicalHistory +
                '}';
    }

    public static class Builder{
        private  String owner;
        private  String name;
        private  String breed;
        private  String species;
        private  int age;
        private  ArrayList<MedicalRecord> medicalHistory;
        public Builder setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setBreed(String breed) {
            this.breed = breed;
            return this;
        }

        public Builder setSpecies(String species) {
            this.species = species;
            return this;
        }

        public Builder setAge(int age){
            this.age = age;
            return this;
        }
        public Builder setMedicalHistory(ArrayList<MedicalRecord> medicalHistory) {
            this.medicalHistory = medicalHistory;
            return this;
        }
        public Builder copy(Pet pet){
            this.owner = pet.owner;
            this.name = pet.name;
            this.breed = pet.breed;
            this.species = pet.species;
            this.age = pet.age;
            this.medicalHistory = pet.medicalHistory;
            return this;
        }
        public Pet build(){return new Pet(this);
        }
    }
}
