package oOP;

public class Rectangle {
    private int width;
    private int height;

    public Rectangle ( int width, int height ){
        this.width = width;
        this.height = height;
    }

    int getWidth(){
        return this.width;
    }

    int getHeight(){
        return this.height;
    }

    void setWidth (int width){
        this.width = width;
    }

    int calculateArea(){
        return this.width * this.height;
    }

    public static void main (String[] args){

        Rectangle p = new Rectangle(12, 8);
        p.setWidth(10);
        System.out.println(p.calculateArea());
    }

}
