package oopPrinciplesInJava.aquarium;

public class Main {
    /*
    * SeaCreature (behavior();)
    * Shark (behavior();)
    * Starfish (behavior())
    * Aquarium (addSeaCreature(); showBehavior(); */
    public static void main(String[] args) {
        Aquarium aquarium1 = new Aquarium();
        Aquarium aquarium2 = new Aquarium();

        SeaCreature creature1 =new Shark();
        SeaCreature creature2 =new Starfish();

        aquarium1.addSeaCreature(creature1);
        aquarium2.addSeaCreature(creature2);

        aquarium1.showCreatureBehavior();
        aquarium2.showCreatureBehavior();

    }

}
