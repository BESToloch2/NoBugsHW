package oopPrinciplesInJava.farm;

public class Cow extends Animal {

    @Override
    public void function() {
        System.out.println("The cow gives milk");
    }

    @Override
    public void care() {
        System.out.println("The cow is grazing");
    }
}
