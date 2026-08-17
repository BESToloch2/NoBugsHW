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

    void setYear (int year){
        this.year = year;
    }

    void print (){
        System.out.printf("brand of a car is: " + this.brand + " and car year is: " + this.year);
    }




    public static void main (String[] args){

        Car c1 = new Car("Ford", 2023);
        Car c2 = new Car("Tesla", 2025);

        c1.print();
        System.out.println("");
        c1.setYear(2024);

        c1.print();
        System.out.println();
        c2.print();
    }
}
