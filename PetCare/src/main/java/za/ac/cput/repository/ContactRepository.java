/*
ContactRepository.java
Contact repository class
Author: Nkheso Mathebula 230762883
*/
package za.ac.cput.repository;

import za.ac.cput.domain.Contact;

import java.util.ArrayList;
import java.util.List;

public class ContactRepository implements IRepository<Contact, String> {

    private static ContactRepository repository;

    private final List<Contact> contacts;

    private ContactRepository() {
        contacts = new ArrayList<>();
    }

    public static ContactRepository getRepository() {
        if (repository == null) {
            repository = new ContactRepository();
        }
        return repository;
    }

    @Override
    public Contact create(Contact contact) {
        contacts.add(contact);
        return contact;
    }

    @Override
    public Contact read(String number) {
        for (Contact contact : contacts) {
            if (contact.getPhoneNumber().equals(number)) {
                return contact;
            }
        }
        return null;
    }

    @Override
    public Contact update(Contact contact) {
        Contact oldContact = read(contact.getPhoneNumber());
        if (oldContact == null) {
            return null;
        }
        Contact deletedContact = delete(oldContact.getPhoneNumber());
        if (deletedContact == null) {
            return null;
        }
        return create(contact);
    }

    @Override
    public Contact delete(String phoneNumber) {
        Contact contact = read(phoneNumber);
        if (contact == null) {
            return null;
        }
        if (contacts.remove(contact)) {
            return contact;
        }
        return null;
    }

    @Override
    public List<Contact> getAll() {
        return contacts;
    }
}
