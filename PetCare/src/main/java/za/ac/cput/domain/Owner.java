package za.ac.cput.domain;

import java.security.Permissions;
import java.util.ArrayList;

public class Owner {
    private String pets;
    private Integer index;

    private Owner() {
    }

    private Owner(Builder builder) {
        this.pets = builder.pets;
        this.index = builder.index;
    }

    public String getPets() {
        return pets;
    }

    public Integer getIndex() {
        return index;
    }


    @Override
    public String toString() {
        return "Owner{" +
                "pets='" + pets + '\'' +
                ", index=" + index +
                '}';
    }

    public static class Builder {
        private String pets;
        private Integer index;

        public Builder setPets(String pets) {
            this.pets = pets;
            return this;
        }
        public Builder setIndex(Integer index) {
            this.index = index;
            return this;
        }

        public Owner build() {
            return new Owner(this);
        }
    }

}
