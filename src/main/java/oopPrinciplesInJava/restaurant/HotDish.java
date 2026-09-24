package oopPrinciplesInJava.restaurant;

public class HotDish extends Dish{
    private int temperature;

    public HotDish(int temperature){
        this.temperature = temperature;
    }

    public int getTemperature(){
        return temperature;
    }
    @Override
    public void showInfo() {
        System.out.println("The temperature of hot dish is: " + getTemperature() + " °F");
    }
}
