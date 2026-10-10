package exceptionsAndGenerics.generics;

public class Task2 {

    public static <T> void printArray(T[] array){
        for (T t : array) {
            System.out.println(t);
        }
    }

    public static void main(String[] args) {
        Integer[] nums = {1,3,7,9,4,23};
        printArray(nums);
    }
}
