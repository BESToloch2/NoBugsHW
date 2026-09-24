package oopPrinciplesInJava.botanicalGarden;

public class BotanicalGarden {
    private Plant plant;

    public void addPlant(Plant plant){
        this.plant = plant;
    }

    public void takeCare(){
        plant.care();
    }


}
