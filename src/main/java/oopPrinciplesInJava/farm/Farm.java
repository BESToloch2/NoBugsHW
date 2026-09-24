package oopPrinciplesInJava.farm;

public class Farm {
    private Animal animal;

    public void addAnimal(Animal animal){
        this.animal = animal;
    }

    public void manageAnimal(){
        animal.function();
        animal.care();
    }
}
