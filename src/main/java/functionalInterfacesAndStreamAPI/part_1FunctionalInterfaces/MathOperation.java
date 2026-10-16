package functionalInterfacesAndStreamAPI.part_1FunctionalInterfaces;
@FunctionalInterface
public interface MathOperation <T extends Number>{
    //1. Создайте свой функциональный интерфейс
    //Задача: Напишите интерфейс MathOperation, который принимает два числа и возвращает результат операции.
    // Реализуйте его с помощью лямбда-выражений: сложение, вычитание, умножение, деление.
    T operation(T a, T b);
}
