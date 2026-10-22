package practice_main.practice_10.synchronizedkeyword;

public class SafeCounter {

    private int counter = 0;

    public synchronized void increment() {
        this.counter++;
    }

    public synchronized void decrement(){
        this.counter--;
    }

    public synchronized int getCounter(){
        return counter;
    }




}
