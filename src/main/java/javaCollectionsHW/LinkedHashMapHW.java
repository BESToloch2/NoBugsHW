package javaCollectionsHW;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapHW {

    //Задача 2:
    //Реализуйте телефонную книгу с LinkedHashMap. Добавьте и найдите контакт.

    private Map<String, String> phoneBook;

    public LinkedHashMapHW(){
        this.phoneBook = new LinkedHashMap<>();
    }

    public void addContact(String name, String phoneNumber){
        phoneBook.put(name, phoneNumber);
    }

    public void findContact(String name){
        System.out.println(phoneBook.getOrDefault(name, "No such contact"));
    }


    public static void main(String[] args) {
        LinkedHashMapHW contacts = new LinkedHashMapHW();
        contacts.addContact("Sasha", "+1-241-453-1235");
        contacts.addContact("Masha", "+1-551-353-7225");
        contacts.addContact("Pasha", "+1-021-444-1987");

        contacts.findContact("Masha");
        contacts.findContact("Dima");
    }


}
