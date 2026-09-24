package oopPrinciplesInJava.museum;

public class Main {
    /*Exhibit (history; storageConditions();)
    Manuscript (history; storageConditions();)
    Sculpture (history; storageConditions();)
    Museum (Exhibit exhibit; manageExhibit(); showExhibitInfo();)
     */
    public static void main(String[] args) {
        Museum museum1 = new Museum();
        Museum museum2 = new Museum();

        Exhibit exhibit1 = new Manuscript("Written in the 15th century");
        Exhibit exhibit2 = new Sculpture("Created in Ancient Rome");

        museum1.addExhibit(exhibit1);
        museum2.addExhibit(exhibit2);

        museum1.manageExhibit();
        museum1.showExhibitInfo();

        museum2.manageExhibit();
        museum2.showExhibitInfo();
    }
}
