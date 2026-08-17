package oOP;

public class Laptop {
    private String brand;
    private double price;

    public Laptop(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void printInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Price: $" + price);
    }

    public static void main(String[] args) {
        Laptop laptop = new Laptop("Asus", 1200);

        laptop.printInfo();

        laptop.setPrice(1000);

        laptop.printInfo();
    }
}
