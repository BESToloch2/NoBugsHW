package oopPrinciplesInJava.restaurant;

public class Main {
    /*
    Dish (showInfo();)
    HotDish (int temperature; showInfo();)
    Drink (in volume; showInfo();)
    Restaurant (addDishToMenu(); printInfo();)
*/
    public static void main(String[] args) {
        Restaurant restaurant1 = new Restaurant();
        Restaurant restaurant2 = new Restaurant();

        Dish dish1 = new Drink(8);
        Dish dish2 = new HotDish(120);

        restaurant1.addDishToMenu(dish1);
        restaurant2.addDishToMenu(dish2);

        restaurant1.printDishInfo();
        restaurant2.printDishInfo();
    }

}
