package za.ac.cput.domain;

public class Contact {

    private String contactId;
    private String phoneNumber;
    private String email;
    private String alternateNumber;

    private Contact(Builder builder) {
        this.contactId = builder.contactId;
        this.phoneNumber = builder.phoneNumber;
        this.email = builder.email;
        this.alternateNumber = builder.alternateNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getAlternateNumber() {
        return alternateNumber;
    }

    public String getContactId() {
        return contactId;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "contactId='" + contactId + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", alternateNumber='" + alternateNumber + '\'' +
                '}';
    }

    public static class Builder {
        private String contactId;
        private String phoneNumber;
        private String email;
        private String alternateNumber;

        public Builder setContactId(String contactId) {
            this.contactId = contactId;
            return this;
        }

        public Builder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setAlternateNumber(String alternateNumber) {
            this.alternateNumber = alternateNumber;
            return this;
        }

        public za.ac.cput.domain.Contact build() {
            return new za.ac.cput.domain.Contact(this);
        }
    }
}


