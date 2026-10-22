package practice_main.practice_10.synchronizedkeyword;

public class Main {
    public static void main(String[] args) {
        SafeCounter safeCounter = new SafeCounter();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                safeCounter.increment();
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                safeCounter.decrement();
            }
        });

        System.out.println(safeCounter.getCounter());
    }
}
