package practice5;

public class Dispatcher {

    public void control(Transport transport){
        transport.start();
    }
    public void printInfo(Transport transport){
        System.out.println("Transport speed is: " + transport.getSpeed());
        System.out.println("Transport capacity is: " + transport.getCapacity());
    }
}
