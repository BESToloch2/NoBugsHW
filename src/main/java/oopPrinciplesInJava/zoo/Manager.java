package oopPrinciplesInJava.zoo;

public class Manager {
     public void addAnimalIntoZoo(Zoo zoo, Animal animal){
         zoo.addAnimal(animal);
     };

     public void showBehavior(Zoo zoo){
         zoo.getAnimal().sound();
         zoo.getAnimal().move();
    };




}
