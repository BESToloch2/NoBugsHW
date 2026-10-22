package multithredingHW;

public class Task3 {
    //3. Задача: использование volatile
    //Условие задачи: Создайте поток, который бесконечно увеличивает счетчик. В основном потоке через 2 секунды установите флаг stop = true, чтобы остановить поток.
    private static volatile boolean active = true;
    static int counter = 0;

    static public void stop(){
        active = false;
        System.out.println("Thread stopped");
    }

    public static int getCounter(){
        return counter;
    }


    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {
            while(active){
                counter++;
                System.out.println(Thread.currentThread().getName() + ". Counter: " + Task3.getCounter());
            }
        });

        t1.start();

        try{
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        Task3.stop();
        try{
            t1.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
