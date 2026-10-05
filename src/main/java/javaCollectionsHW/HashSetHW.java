package javaCollectionsHW;

import java.util.*;

public class HashSetHW {

    //Задача 2:
    //Добавьте в HashSet 10 чисел. Проверьте, содержит ли он заданное число.

    private HashSet<Integer> numbers;

    public HashSetHW(){
        this.numbers = new HashSet<>();
    }

    Random r = new Random();

    public void add_10_random_numbers(){
        for (int i = 0; i < 10; i++) {
            numbers.add(r.nextInt(20));
        }
    }

    //Задача 3:
    //Реализуйте метод, который принимает List<String> и возвращает Set<String> без дубликатов.

    public static Set<String> deleteDuplicates(List<String> names){
        Set<String> originalNames = new HashSet<>();

        for (String name : names){
            originalNames.add(name);
        }
        return originalNames;
    }

    public void PresenceOfANumber(Integer number){
        System.out.println(numbers.contains(number));
    }

    public static void main(String[] args) {

        //Задача 2:
        //Добавьте в HashSet 10 чисел. Проверьте, содержит ли он заданное число.

        HashSetHW numbers = new HashSetHW();
        numbers.add_10_random_numbers();
        System.out.println("Does set of numbers contains number 10?");
        numbers.PresenceOfANumber(10);

        //Задача 3:
        //Реализуйте метод, который принимает List<String> и возвращает Set<String> без дубликатов.
        ArrayList<String> names = new ArrayList<>();
        names.add("Sasha");
        names.add("Alex");
        names.add("Oleksandr");
        names.add("Alex");
        names.add("Oleksandr");

        System.out.println();

        names.forEach(System.out::println);

        Set<String> originalNames = HashSetHW.deleteDuplicates(names);

        System.out.println();

        originalNames.forEach(System.out::println);
    }
}
