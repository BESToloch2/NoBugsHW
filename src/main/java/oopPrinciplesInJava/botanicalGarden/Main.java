package oopPrinciplesInJava.botanicalGarden;

public class Main {
    /*Plant (care();)
    * Orchid (care();)
    * Cactus (care();)
    * BotanicalGarden (addPlant(); takeCare();)
     */

    public static void main(String[] args) {
        BotanicalGarden botanicalGarden1 = new BotanicalGarden();
        BotanicalGarden botanicalGarden2 = new BotanicalGarden();

        Plant plant1 = new Orchid();
        Plant plant2 = new Cactus();

        botanicalGarden1.addPlant(plant1);
        botanicalGarden2.addPlant(plant2);

        botanicalGarden1.takeCare();
        botanicalGarden2.takeCare();
    }
}
