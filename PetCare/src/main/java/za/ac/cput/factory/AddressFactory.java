/*
AddressFactory.java
Address factory class
Author: Nkheso Mathebula 230762883
*/
package za.ac.cput.factory;

import za.ac.cput.domain.Address;

public class AddressFactory {
    public static Address createAddress(int houseNumber, String streetName, String town, String city, String postalCode) {
        if (houseNumber <= 0 || streetName == null || streetName.isEmpty() ||
                town == null || town.isEmpty() || city == null || city.isEmpty() ||
                postalCode == null || postalCode.isEmpty()) {
            return null;
        }

        return new Address.Builder()
                .setHouseNumber(houseNumber)
                .setStreetName(streetName)
                .setTown(town)
                .setCity(city)
                .setPostalCode(postalCode)
                .build();
    }
}
