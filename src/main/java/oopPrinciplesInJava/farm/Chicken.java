package oopPrinciplesInJava.farm;

public class Chicken extends Animal{
    @Override
    public void function() {
        System.out.println("The chicken gives eggs");
    }

    @Override
    public void care() {
        System.out.println("The chicken demands grain");
    }
}
