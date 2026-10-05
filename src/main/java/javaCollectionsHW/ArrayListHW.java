package javaCollectionsHW;

import java.util.ArrayList;
import java.util.Random;

public class ArrayListHW {

    public static void main(String[] args) {

        //Задача 1:
        //Создайте ArrayList из 5 чисел. Добавьте ещё одно число в конец. Выведите весь список.
        ArrayList<Integer> nums = new ArrayList<>();
        Random r = new Random();

        for (int i = 0; i < 5; i++) {
            nums.add(r.nextInt(100));
        }

        nums.add(7);
        nums.forEach(System.out::println);

        //Задача 3:
        //Создайте ArrayList из строк. Найдите в нём самую длинную строку и выведите её.

        ArrayList<String> strings = new ArrayList<>();
        strings.add("Sasha");
        strings.add("Alex");
        strings.add("Oleksandr");

        String longestString = strings.get(0);

        for (int i = 1; i < strings.size(); i++) {

            if (strings.iterator().hasNext()){
                   longestString = strings.get(i);
            }
        }
        System.out.println("Longest string is: " + longestString);



    }
}
