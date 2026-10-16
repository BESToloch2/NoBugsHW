package practice_main.practice_9;
@FunctionalInterface
public interface Checker {
    boolean condition(int n);

    default void printIfValid(int n){
        if (condition(n)){
            System.out.println(n);
        }
    }
}
