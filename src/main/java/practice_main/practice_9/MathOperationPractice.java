package practice_main.practice_9;
@FunctionalInterface
public interface MathOperationPractice<T extends Number> {
    T apply (T a, T b);
}
