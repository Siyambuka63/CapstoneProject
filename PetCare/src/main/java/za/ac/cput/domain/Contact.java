/*
Contact.java
Contact class
Author: Nkheso Mathebula 230762883
*/

package za.ac.cput.domain;

public class Contact {
    private String phoneNumber;
    private String email;


    private Contact(Builder builder) {
        this.phoneNumber = builder.phoneNumber;
        this.email = builder.email;
    }


    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public static class Builder {
        private String phoneNumber;
        private String email;

        public Builder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Contact build() {
            return new Contact(this);
        }
    }
}
