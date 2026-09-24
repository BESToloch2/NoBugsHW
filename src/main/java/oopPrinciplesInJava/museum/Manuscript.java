package oopPrinciplesInJava.museum;

public class Manuscript extends Exhibit{

    public Manuscript(String history){
        super(history);
    }

    @Override
    public void storageConditions() {
        System.out.println("Manuscript requires controlled humidity");
    }
}
