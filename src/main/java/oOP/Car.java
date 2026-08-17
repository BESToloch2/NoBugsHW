package oOP;

public class Car {
    private String brand;
    private int year;

    public Car(String brand, int year){
        this.brand=brand;
        this.year=year;
    }

    String getBrand(){
        return this.brand;
    }

    int getYear(){
        return this.year;
    }

    void setBrand (String brand){
        this.brand=brand;
    }
}
