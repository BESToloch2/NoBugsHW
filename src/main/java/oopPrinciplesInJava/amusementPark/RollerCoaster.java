package oopPrinciplesInJava.amusementPark;

public class RollerCoaster extends Attraction{
    @Override
    public void showInfo() {
        System.out.println("Roller coaster: fast and extreme ride");
    }

    @Override
    public void maintenance() {
        System.out.println("Roller coaster requires safety check");
    }
}
