package oOP;

public class Point {
    private double x;
    private double y;

    Point (double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    void print(){
        System.out.println("x: " + this.x + " and y: " + this.y);
    }

    public static void main(String[] args) {
        Point p = new Point(12.5, 21.04);
        p.setX(15.5);
        p.print();
    }
}
