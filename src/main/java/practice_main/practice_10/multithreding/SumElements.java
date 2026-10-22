package practice_main.practice_10.multithreding;

public class SumElements {
    //Calculate sum of elements of big array with help of division task on parts and few threads
    //first part : from 0 - array.length / 2
    //second part: from array.lenght / 2 + 1 - array.length
    private final static int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    public static void main(String[] args) throws InterruptedException {
        int sum = parallelSum(array);
        System.out.println("Sum of array: " + sum);
    }

    public static int parallelSum(int[] array) throws InterruptedException {
        int halfArray = array.length / 2;

        ThreadSum firstHalf = new ThreadSum(array, 0, halfArray);
        ThreadSum secondHalf = new ThreadSum(array, halfArray, array.length);

        Thread t1 = new Thread(firstHalf);
        Thread t2= new Thread(secondHalf);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        return firstHalf.getSum() + secondHalf.getSum();
    }
}
