package oopPrinciplesInJava.pets;

public class Cat extends Pet{

    @Override
    public void care() {
        play();
        System.out.println("Cat eats wet food");
    }

    public void play() {
        System.out.println("Cat plays");
    }
}
