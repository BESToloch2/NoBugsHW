package oopPrinciplesInJava.pets;

public class Main {
    /*
    * Pet (care();)
    * Dog (walk(); care();)
    * Cat (play(); care();)
    * PetHotel (Pet pet; takeCare();)
    * */

    public static void main (String[] args){
        Pet pet = new Cat();
        PetHotel petHotel = new PetHotel();
        petHotel.addPetIntoHotel(pet);

        petHotel.takeCare(pet);






    }
}
