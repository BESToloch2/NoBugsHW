package oopPrinciplesInJava.amusementPark;

public class Carousel extends Attraction{
    @Override
    public void showInfo() {
        System.out.println("Carousel: calm and relaxing ride");
    }

    @Override
    public void maintenance() {
        System.out.println("Carousel requires technical maintenance");
    }
}
