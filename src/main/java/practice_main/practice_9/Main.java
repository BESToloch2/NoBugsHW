package practice_main.practice_9;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        //Practice with FI creation
        MathOperationPractice<Double> sum = (a, b) -> a + b;

        System.out.println(sum.apply(4.0, 6.0));

        //usage of default method in interface
        Checker condition = n -> n > 0;

        condition.printIfValid(6);

        //Creation of anonymous class
        Checker anonClass = new Checker() {
            @Override
            public boolean condition(int n) {
                System.out.println("Test");
                return false;
            }
        };
        anonClass.condition(6);

        //Stream API practice
        List<Integer> numbers = List.of(1,2,3,4,5,6);

        /*IntStream stream = numbers.stream()
                .filter(n -> n % 2 == 0)
                .mapToInt(Integer::intValue);

        int sum1 = stream.sum();*/

        int sum1 = numbers.stream()
                .filter(n -> n % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(sum1);



    // Group BY API STREAM
    List<String> names = List.of("John:M", "Sara:F", "Sasha:M");

    Map<String,List<String>> groupedByGender = names.stream()
            .collect(Collectors.groupingBy(n -> n.split(":")[1],
                    Collectors.mapping(n -> n.split(":")[0],
                            Collectors.toList())));
        System.out.println(groupedByGender);




    }
}
