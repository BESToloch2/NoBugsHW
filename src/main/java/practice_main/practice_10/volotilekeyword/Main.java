package practice_main.practice_10.volotilekeyword;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        StatusChecker statusChecker = new StatusChecker();
        Thread t1 = new Thread(statusChecker);
        t1.start();

        //Thread.sleep(1000);

        Thread t2= new Thread(statusChecker::stop);
        t2.start();

    }
}
