package oopPrinciplesInJava.pets;

import oopPrinciplesInJava.zoo.Animal;

public class PetHotel {
    private Pet pet;

    public void addPetIntoHotel(Pet pet){
        this.pet = pet;
    }

    public void takeCare(Pet pet){
        pet.care();
    }


}
