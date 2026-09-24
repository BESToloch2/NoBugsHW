package oopPrinciplesInJava.zoo;

public class Zoo {

    private Animal animal;

    public void addAnimalIntoZoo(Animal animal) {
        this.animal = animal;
    }

    public Animal getAnimal(){
        return animal;
    }

    public void showBehavior(Zoo zoo){
        zoo.getAnimal().sound();
        zoo.getAnimal().move();
    };


}
