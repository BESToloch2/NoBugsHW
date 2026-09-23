package oopPrinciplesInJava.zoo;

public class Elephant extends Animal{

    @Override
    void sound() {
        System.out.println("Elephant trumpets");
    }

    @Override
    void move() {
        System.out.println("Elephant walks");
    }
}
