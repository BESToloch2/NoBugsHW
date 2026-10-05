package javaCollectionsHW;

import java.util.LinkedHashSet;

public class LinkedHashSetHW {

    //Задача 1:
    //Создайте LinkedHashSet и добавьте в него 5 строк. Проверьте порядок элементов при выводе.

    public static void main(String[] args) {
        LinkedHashSet<String> strings = new LinkedHashSet<>();

        strings.add("Hello, ");
        strings.add("My ");
        strings.add("Name ");
        strings.add("Is ");
        strings.add("Sasha");

        strings.forEach(System.out::print);
    }
}
