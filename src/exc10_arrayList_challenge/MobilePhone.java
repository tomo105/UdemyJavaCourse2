package exc10_arrayList_challenge;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> contacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.contacts = new ArrayList<>();
    }

    public void printContacts() {
        System.out.println("you have: " + contacts.size() + " Contact(s)");
        for (Contact contact : this.contacts) {
            System.out.println("Name: " + contact.getName() + " number: " + contact.getPhoneNumber());
        }
    }

    public void addContact(Contact contact) {
        if (!ifContains(contact)) {
            contacts.add(contact);
            System.out.println("successfully added a contact");
        } else
            System.out.println("You have already this contact!");
    }

    public void updateContact(String name, Contact contact) {
        int index = getIndexByName(name);
        if (index >= 0) {
            contacts.set(index, contact);
            System.out.println("contact successfully updated");
        } else {
            System.out.println("you haven't got this contact in your mobile: " + contact.getName() + " " + contact.getPhoneNumber());
        }

    }

    private int getIndexByName(String name) {   // index of specific contact to update
        int index = 0;
        for (Contact contact : contacts) {
            if (contact.getName().equals(name)) {
                return index;
            } else
                index += 1;
        }
        return -1;
    }

    public Boolean ifContainsName(String name) {   // index of specific contact to update
        for (Contact contact : contacts) {
            if (contact.getName().equals(name))
                return true;
        }
        return false;
    }

    private int findContactIndex(Contact contact) {
        return contacts.indexOf(contact);
    }

    public void removeContact(Contact contact) {
        if (ifContains(contact)) {
            contacts.remove(contact);
            System.out.println("Contact " + contact.getName() + " " + contact.getPhoneNumber() + " removes successfully");
        } else
            System.out.println("You don't have this contact already");
    }

    private Boolean ifContains(Contact contact) {
        return contacts.contains(contact);

    }

}
