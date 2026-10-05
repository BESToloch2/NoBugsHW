package javaCollectionsHW;

import java.util.HashMap;
import java.util.Map;

public class HashMapHW {

    //Задача 3:
    //Реализуйте метод, который печатает из HashMap всех пользователей младше 18 лет.
    public static void printUsersYoungerThan18(Map<String,Integer> users){
        for (Map.Entry<String, Integer> user : users.entrySet()){
            if (user.getValue() < 18){
                System.out.println(user.getKey() + " " + user.getValue());
            }
        }
    }

    public static void main(String[] args) {
        HashMap<String, Integer> users = new HashMap<>();

        users.put("Sasha", 25);
        users.put("Oleksandr", 30);
        users.put("Alex", 18);
        users.put("Aleksandr", 22);
        users.put("Sashko", 14);

        //Задача 2:
        //Проверьте, есть ли определённое имя в HashMap.
        System.out.println(users.containsKey("Sasha"));

        //Задача 3:
        //Реализуйте метод, который печатает из HashMap всех пользователей младше 18 лет.

        printUsersYoungerThan18(users);
    }
}
