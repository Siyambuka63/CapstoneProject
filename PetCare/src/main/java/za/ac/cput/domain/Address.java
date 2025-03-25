package za.ac.cput.domain;

public class Address {
    private  int houseNumber;
    private String streetName;
    private String town;
    private String city;
    private String postalCode;


    private Address(Builder builder) {
        this.houseNumber = builder.houseNumber;
        this.streetName = builder.streetName;
        this.town = builder.town;
        this.city = builder.city;
        this.postalCode = builder.postalCode;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public String getTown() {
        return town;
    }

    public String getCity() {
        return city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public static class Builder {
        private int houseNumber;
        private String streetName;
        private String town;
        private String city;
        private String postalCode;

        public Builder setHouseNumber(int houseNumber) {
            this.houseNumber = houseNumber;
            return this;
        }

        public Builder setStreetName(String streetName) {
            this.streetName = streetName;
            return this;
        }

        public Builder setTown(String town) {
            this.town = town;
            return this;
        }

        public Builder setCity(String city) {
            this.city = city;
            return this;
        }

        public Builder setPostalCode(String postalCode) {
            this.postalCode = postalCode;
            return this;
        }

        public Address build() {
            return new Address(this);
        }
    }

    @Override
    public String toString() {
        return "Address{" +
                "houseNumber=" + houseNumber +
                ", streetName='" + streetName + '\'' +
                ", town='" + town + '\'' +
                ", city='" + city + '\'' +
                ", postalCode='" + postalCode + '\'' +
                '}';
    }
}
