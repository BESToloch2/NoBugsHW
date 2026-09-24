package oopPrinciplesInJava.restaurant;

public class Drink extends Dish{
    private int volume;

    public Drink (int volume){
        this.volume = volume;
    }

    public int getVolume(){
        return volume;
    }

    @Override
    public void showInfo(){
        System.out.println("The drink volume is: " + getVolume() + " oz");
    }
}
