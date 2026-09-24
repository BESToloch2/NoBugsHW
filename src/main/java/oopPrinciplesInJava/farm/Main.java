package oopPrinciplesInJava.farm;

public class Main {
    /*Animal (function(); care());
    * Cow (function(); care())
    * Chicken (function(); care())
    * Farm (Animal animal; takeCare(); takeHarvest();*/
    public static void main(String[] args) {
        Farm farm1 = new Farm();
        Farm farm2 = new Farm();

        Animal animal1 = new Cow();
        Animal animal2 = new Chicken();

        farm1.addAnimal(animal1);
        farm2.addAnimal(animal2);

        farm1.manageAnimal();
        farm2.manageAnimal();


    }

}
