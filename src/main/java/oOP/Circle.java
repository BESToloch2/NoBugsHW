package oOP;

public class Circle {
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double calculateArea(){
        return Math.PI * radius * radius;
    }

    public double calculateCircumference(){
    return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        Circle c = new Circle(12.5);
        c.setRadius(15.2);
        System.out.println("Circle area is: " + c.calculateArea() + " and circle circumference is: " + c.calculateCircumference());
    }

}
