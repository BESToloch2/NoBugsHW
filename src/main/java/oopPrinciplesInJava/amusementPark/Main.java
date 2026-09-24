package oopPrinciplesInJava.amusementPark;

public class Main {
    /*Attraction (showInfo(); maintenance();)
    * RollerCoaster (showInfo(); maintenance();)
    * Carousel (showInfo(); maintenance();)
    * AmusementPark (Attraction attraction; manageAttraction(); showAttractionInfo();)*/

    public static void main(String[] args) {
        AmusementPark amusementPark1 = new AmusementPark();
        AmusementPark amusementPark2 = new AmusementPark();

        Attraction attraction1 = new RollerCoaster();
        Attraction attraction2 = new Carousel();

        amusementPark1.addAttraction(attraction1);
        amusementPark2.addAttraction(attraction2);

        amusementPark1.manageAttraction();
        amusementPark1.showAttractionInfo();
        amusementPark2.manageAttraction();
        amusementPark2.showAttractionInfo();
    }
}
