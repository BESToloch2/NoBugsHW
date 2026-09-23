package oopPrinciplesInJava.zoo;

public class Bird extends Animal {


    @Override
    void sound() {
        System.out.println("Bird chirps");
    }

    @Override
    void move() {
        System.out.println("Bird flies");
    }
}
