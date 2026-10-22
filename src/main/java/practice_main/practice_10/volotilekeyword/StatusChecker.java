package practice_main.practice_10.volotilekeyword;

public class StatusChecker implements Runnable {
    private volatile boolean active = true;

    @Override
    public void run() {
        while (active){
            System.out.println(Thread.currentThread().getName());
        }

    }

    public void stop(){
        System.out.println(Thread.currentThread().getName());
        active = false;
    }
}
