package functionalInterfacesAndStreamAPI.part_1FunctionalInterfaces;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        //1. Создайте свой функциональный интерфейс
        //Задача: Напишите интерфейс MathOperation, который принимает два числа и возвращает результат операции.
        // Реализуйте его с помощью лямбда-выражений: сложение, вычитание, умножение, деление.
        MathOperation<Number> add = (a, b) -> a.doubleValue() + b.doubleValue();
        MathOperation<Number> subtract = (a, b) -> a.doubleValue() - b.doubleValue();
        MathOperation<Number> multiply = (a, b) -> a.doubleValue() * b.doubleValue();
        MathOperation<Number> divide = (a, b) -> a.doubleValue() / b.doubleValue();

        System.out.println(add.operation(4, 6));
        System.out.println(subtract.operation(4, 6));
        System.out.println(multiply.operation(4, 6));
        System.out.println(divide.operation(4, 6));

        //2. Использование анонимного класса
        //Задача: Создайте анонимный класс, реализующий интерфейс Runnable, который выводит сообщение "Hello from
        // anonymous class!".
        Runnable task2 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from anonymous class!");
            }
        };

        task2.run();

        //3. Лямбда-выражение с Predicate
        //Задача: Напишите лямбду, которая проверяет, является ли число чётным.
        Predicate<Integer> isEven = n -> n % 2 == 0;
        System.out.println(isEven.test(5));
        System.out.println(isEven.test(6));

        //4. Лямбда-выражение с Function
        //Задача: Создайте лямбду, которая принимает строку и возвращает её длину.
        Function<String, Integer> length = String::length;

        System.out.println(length.apply("Oops... My microphone was off"));

        //5. Использование Consumer
        //Задача: Напишите лямбду, которая принимает строку и печатает её в консоль.
        Consumer<String> run = System.out::println;

        run.accept("It`s alive! IIITTT`SSss AAALliivee!!!");


    }
}
