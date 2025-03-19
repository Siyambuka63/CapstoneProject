package za.ac.cput.domain;

public class Person {
    private String name;
    private Contact contact;
    private Address address;

    private Person(){}

    private Person(Builder builder) {
        this.name = builder.name;
        this.contact = builder.contact;
        this.address = builder.address;
    }

    public String getName() {
        return name;
    }

    public Contact getContact() {
        return contact;
    }

    public Address getAddress() {
        return address;
    }

    // Builder Class
    public static class Builder {
        private String name;
        private Contact contact;
        private Address address;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setContact(Contact contact) {
            this.contact = contact;
            return this;
        }

        public Builder setAddress(Address address) {
            this.address = address;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                ", name='" + name + '\'' +
                ", contact=" + contact +
                ", address=" + address +
                '}';
    }
}

