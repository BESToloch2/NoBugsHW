package oopPrinciplesInJava.amusementPark;

public class AmusementPark {
    private Attraction attraction;

    public void addAttraction(Attraction attraction){
        this.attraction = attraction;
    }

    public void showAttractionInfo(){
        attraction.showInfo();
    }

    public void manageAttraction(){
        attraction.maintenance();
    }
}
