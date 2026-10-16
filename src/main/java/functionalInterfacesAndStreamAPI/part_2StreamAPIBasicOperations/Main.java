package functionalInterfacesAndStreamAPI.part_2StreamAPIBasicOperations;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> strings = List.of("Hello", "This", "Is", "My", "Stream", "Operations", "Home", "Work");
        List<Integer> numbers = List.of(1,3,4,5,6,7,8,1125,1254,6753,658,879,123,7876,80,15,50,4536,5634,762,10);
        List<Integer> numbers2 = List.of(1,1,2,2,3,3,5,5);


        //1. Фильтрация строк по длине больше 5
        //Задача: Напишите программу, которая принимает список строк и удаляет из него все строки длиной 5 символов и менее, используя Stream API.
        List<String> stream1 = strings.stream()
                .filter(s -> s.length() > 5)
                .collect(Collectors.toList());

        System.out.println(stream1);

        //2. Фильтрация чисел, кратных 5
        //Задача: Напишите программу, которая принимает список чисел и отбирает только те, которые делятся на 5 без остатка, используя Stream API.
        List<Integer> stream2 = numbers.stream()
                .filter(n -> n % 5 == 0)
                .collect(Collectors.toList());

        System.out.println(stream2);

        //3. Преобразование строк в их длины
        //Задача: Напишите программу, которая принимает список строк и заменяет каждую строку на её длину, используя Stream API.
        List<Integer> stream3 = strings.stream()
                .map(String::length)
                .collect(Collectors.toList());

        System.out.println(stream3);

        //4. Создание списка квадратов чисел
        //Задача: Напишите программу, которая принимает список чисел и преобразует его в новый список, где каждое число заменено на его квадрат, используя Stream API.
        List<Integer> stream4 = numbers.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());

        System.out.println(stream4);

        //5. Удаление дубликатов из списка:
        //Нужно оставить только уникальные элементы. После создания потока применяем метод distinct, который удаляет повторы. Затем собираем результат в список.
        List<Integer> stream5 = numbers2.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(stream5);
    }
}
