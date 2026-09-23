package oopPrinciplesInJava.zoo;

public class Main {
    /*
    1.
    Animal (sound(); move();)
    Bird extends Animal
    Elephant extends Animal
    Zoo (Animal animal)
    Manager (addAnimal(animal); makeSound(); makeMove();)
    */

    public static void main(String[] args){
        Zoo zoo_1 = new Zoo();
        Zoo zoo_2 = new Zoo();

        Animal elephant = new Elephant();
        Animal bird = new Bird();

        Manager manager = new Manager();

        manager.addAnimalIntoZoo(zoo_1, elephant);
        manager.addAnimalIntoZoo(zoo_2, bird);

        manager.showBehavior(zoo_1);
        manager.showBehavior(zoo_2);
    }
}
