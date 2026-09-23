package practice5;

public class Main {
    public static void main(String[] args) {
        Transport car = new Car();
        Transport plane = new Plane();
        Transport ship = new Ship();
        Dispatcher dispatcher = new Dispatcher();

        dispatcher.control(car);
        dispatcher.printInfo(ship);
    }
}
