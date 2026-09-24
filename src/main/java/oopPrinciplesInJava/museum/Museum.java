package oopPrinciplesInJava.museum;

public class Museum {
    private Exhibit exhibit;

    public void addExhibit(Exhibit exhibit){
        this.exhibit = exhibit;
    }

    public void manageExhibit(){
        exhibit.storageConditions();
    }

    public void showExhibitInfo(){
        System.out.println(exhibit.getHistory());
    }
}
