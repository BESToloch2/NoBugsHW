package oopPrinciplesInJava.pets;

public class Dog extends Pet{
    @Override
    public void care() {
        walk();
        System.out.println("Dog eats dry food");
    }

    public void walk() {
        System.out.println("Dog walks");
    }
}
