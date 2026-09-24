package oopPrinciplesInJava.museum;

public class Sculpture extends Exhibit {

    public Sculpture(String history) {
        super(history);
    }

    @Override
    public void storageConditions() {
        System.out.println("Sculpture needs restoration");
    }
}
