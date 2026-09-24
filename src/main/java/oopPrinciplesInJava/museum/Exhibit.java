package oopPrinciplesInJava.museum;

public abstract class Exhibit {
    private String history;

    public Exhibit(String history){
        this.history = history;
    }

    public String getHistory() {
        return history;
    }

    public abstract void storageConditions();
}
