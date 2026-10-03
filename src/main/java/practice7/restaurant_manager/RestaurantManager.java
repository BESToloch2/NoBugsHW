package practice7.restaurant_manager;

import java.util.LinkedList;

public class RestaurantManager {
    private LinkedList<String> orders;
    public RestaurantManager(){
        this.orders = new LinkedList<>();
    }

    //Method to add order
    public void addOrder(String order){
        orders.addLast(order);
    }

    //Method to show all orders
    public void printAllOrders(){
        System.out.println("All orders:");
        orders.forEach(System.out::println);
        System.out.println();
    }

    //Method to retrieve first the order
    public void retrieveFirstOrder(){
        orders.poll();
    }

    //Method to delete any order
    public void deleteOrder(String order){
        orders.remove(order);
    }

    public static void main(String[] args) {
        RestaurantManager manager = new RestaurantManager();
        manager.addOrder("French Fries");
        manager.addOrder("Burger");
        manager.addOrder("Brussels Sprouts");

        manager.printAllOrders();

        manager.deleteOrder("Burger");

        manager.printAllOrders();

        manager.retrieveFirstOrder();

        manager.printAllOrders();
    }
}
