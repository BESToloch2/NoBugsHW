package functionalInterfacesAndStreamAPI.part_3StreamAPIAggregatingOperations;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> strings = List.of("Hello", "Brother", "This", "Is", "My", "Stream", "Operations", "Home", "Work", "By", "The", "Way");
        List<Integer> numbers2 = List.of(1,1,2,2,3,3,5,5);

        //1. Поиск максимального элемента
        //Задача: Напишите программу, которая принимает список чисел и находит в нём самое большое число, используя Stream API.
        int stream1 = numbers2.stream()
                .max(Comparator.naturalOrder())
                .get();

        System.out.println(stream1);

        //2. Поиск минимального элемента
        //Задача: Напишите программу, которая принимает список чисел и находит в нем наименьшее число, используя Stream API.
        int stream2 = numbers2.stream()
                .min(Comparator.naturalOrder())
                .get();

        System.out.println(stream2);

        //3. Сумма всех элементов списка
        //Задача: Напишите программу, которая принимает список чисел и вычисляет их сумму, используя Stream API.

        int stream3 = numbers2.stream()
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println(stream3);

        //4. Поиск первого элемента, начинающегося на "Б"
        //Задача: Напишите программу, которая принимает список строк и находит первую строку, начинающуюся на букву "Б", используя Stream API.
        String stream4 = strings.stream()
                .filter(s -> s.startsWith("B"))
                .findFirst()
                        .orElse("Not found!");

        System.out.println(stream4);

        //5. Проверка наличия хотя бы одного элемента по условию
        //Задача: Напишите программу, которая проверяет, есть ли хотя бы один элемент в списке, который удовлетворяет заданному условию (например, является чётным числом), используя Stream API.
        boolean stream5 = numbers2.stream()
                .anyMatch(n -> n % 2 == 0);

        System.out.println(stream5);
    }
}
