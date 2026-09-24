package oopPrinciplesInJava.zoo;

public class Main {
    /*
    1.
    Animal (sound(); move();)
    Bird extends Animal
    Elephant extends Animal
    Zoo (Animal ; addAnimal(animal); makeSound(); makeMove();)
    */

    public static void main(String[] args){
        Zoo zoo_1 = new Zoo();
        Zoo zoo_2 = new Zoo();

        Animal elephant = new Elephant();
        Animal bird = new Bird();

        zoo_1.addAnimalIntoZoo(elephant);
        zoo_2.addAnimalIntoZoo(bird);

        zoo_1.showBehavior(zoo_1);
        zoo_1.showBehavior(zoo_2);
    }
}
