package oOP;

public class Product {
    private String name;
    private double price;

    public Product (String name, double price){
        this.price = price;
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void applyDiscount( int discount) {
        price = price - (price * discount / 100);
    }

    public void printInfo(){
        System.out.println("Product name: " + name);
        System.out.println("Product price: " + price);
    }

    public static void main(String[] args) {
        Product desk = new Product("Razer", 123);
        desk.setPrice(111);
        desk.applyDiscount(20);
        desk.printInfo();

    }
}
