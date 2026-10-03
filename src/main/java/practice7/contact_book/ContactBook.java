package practice7.contact_book;

import java.util.HashMap;

public class ContactBook {
    private HashMap <String,String> contacts;
    public ContactBook(){
        this.contacts = new HashMap<>();
    }

    public void addContact(String name, String phoneNumber){
        contacts.put(name, phoneNumber);
    }

    public String getPhone(String name){
        return contacts.get(name);
    }

    public void updatePhoneNumber(String name, String number){
        contacts.put(name, number);
    }

    public void printAllContacts() {
        System.out.println("All contacts: ");
        contacts.forEach(
                (String name,String phone) -> {
                    System.out.println("Name: " + "phone: " + phone);
        }
        );
    }

}
