package multithredingHW;

import java.util.concurrent.*;

public class Task4 {
    //4. Задача: использование synchronized
    //Условие задачи: Напишите класс Counter с методом increment, увеличивающим значение счётчика. Создайте два потока, каждый из которых вызывает increment() 1000 раз. Обеспечьте правильную работу с помощью synchronized.
    private int counter = 0;

    synchronized void increment(){
        counter++;
    }

    public int getCounter(){
        return counter;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Task4 counter = new Task4();

        ExecutorService executor = Executors.newFixedThreadPool(2);

        Runnable task = () -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        };

       Future<?> future1 = executor.submit(task);
       Future<?> future2 = executor.submit(task);
       future1.get();
       future2.get();

       System.out.println("Counter: " + counter.getCounter());

       executor.shutdown();
    }
}
