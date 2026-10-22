package multithredingHW;

public class Task1 {
    //1. Задача: создание одного потока
    //Условие задачи: Напишите программу, в которой создается отдельный поток, выводящий сообщение "Привет из потока!" 5 раз с паузой в 1 секунду между сообщениями.
    public static void main(String[] args) {
        Runnable task = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Loop " + (i + 1) + ". Hello from thread: " + Thread.currentThread().getName());
                try {
                    Thread.sleep(1000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        };

        Thread t1 = new Thread(task);
        t1.start();
    }
}
