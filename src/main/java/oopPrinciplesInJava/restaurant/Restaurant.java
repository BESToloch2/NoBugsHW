package oopPrinciplesInJava.restaurant;

public class Restaurant {
    private Dish dish;

    public void addDishToMenu(Dish dish){
        this.dish = dish;
    }

    public void printDishInfo(){
        dish.showInfo();
    }
}
