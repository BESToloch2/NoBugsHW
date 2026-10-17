package functionalInterfacesAndStreamAPI.part_4StreamAPIGroupingByAndReduction;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> strings = List.of("Alex", "Sasha", "Oleksandr", "Pavel", "Nikolay", "Sanya", "Oleg", "Anna");
        List<Integer> numbers2 = List.of(1,2,2,3,5,5,734,34,78,10);

        //1. Группировка строк по первой букве
        //Задача: Напишите программу, которая принимает список строк и группирует их по первой букве, используя Stream API.
        Map<Character, List<String>> stream1 = strings.stream()
                .collect(Collectors.groupingBy(n -> n.charAt(0)));

        System.out.println(stream1);

        //2. Группировка чисел по чётности
        //Задача: Напишите программу, которая принимает список чисел и группирует их на чётные и нечётные, используя Stream API.
        Map<String, List<Integer>> stream2 = numbers2.stream()
                .collect(Collectors.groupingBy(n -> n % 2 == 0 ? "Even" : "Odd"));

        System.out.println(stream2);

        //3. Поиск среднего значения чисел
        //Задача: Напишите программу, которая принимает список чисел и находит их среднее значение, используя Stream API.
       double stream3 = numbers2.stream()
                .collect(Collectors.averagingInt(Integer::intValue));

        System.out.println(stream3);


    }
}
