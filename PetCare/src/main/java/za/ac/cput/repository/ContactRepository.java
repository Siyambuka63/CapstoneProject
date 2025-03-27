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
    public Contact read(String contactId) {
        for (Contact contact : contacts) {
            if (contact.getContactId().equals(contactId)) {
                return contact;
            }
        }
        return null;
    }

    @Override
    public Contact update(Contact contact) {
        Contact oldContact = read(contact.getContactId());
        if (oldContact == null) {
            return null;
        }
        Contact deletedContact = delete(oldContact.getContactId());
        if (deletedContact == null) {
            return null;
        }
        return create(contact);
    }

    @Override
    public Contact delete(String contactId) {
        Contact contact = read(contactId);
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
