package oopPrinciplesInJava.aquarium;

public class Aquarium {

    private SeaCreature seeCreature;

    public void addSeaCreature(SeaCreature creature){
        this.seeCreature = creature;
    }

    public void showCreatureBehavior(){
        seeCreature.behavior();
    }
}
