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

        String contactId = Helper.generateId();

        return new Contact.Builder()
                .setContactId(contactId)
                .setPhoneNumber(phoneNumber)
                .setEmail(email)
                .build();
    }

    public static void main(String[] args) {
        Contact contact = createContact("0836431131", "angu@gmail.com");

        if (contact != null) {
            System.out.println(contact);
        } else {
            System.out.println("Contact creation failed. Check input values.");
        }
    }
}
