/*
ContactFactory.java
Contact Factory class
Author: Nkheso Mathebula 230762883
*/
package za.ac.cput.factory;

import za.ac.cput.domain.Contact;
import za.ac.cput.util.Helper;

public class ContactFactory {
    public static Contact createContact(String phoneNumber, String email) {
        if (Helper.isNullOrEmpty(phoneNumber) || Helper.isNullOrEmpty(email)) {
            return null;
        }

        return new Contact.Builder()
                .setPhoneNumber(phoneNumber)
                .setEmail(email)
                .build();
    }
}
