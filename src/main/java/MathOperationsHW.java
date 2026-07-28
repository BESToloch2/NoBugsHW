public class MathOperationsHW {
    /*1*/
    public static int add (int x, int y){ return x + y; }
    public static int subtract (int x, int y){ return x - y; }
    public static int multiply (int x, int y){ return x * y; }
    public static double divide (int x, int y){
        if(y==0){return -1; }
        return (double) x / y; }

    /*2*/
    public static int findMax(int x, int y){
        if(x > y){return x; }
        return y;
    }

    /*3*/
    public static int difference(int x, int y){
        if (y > x){ return y - x;}
        return x - y;
    }

    /*4*/
    public static int squarePerimeter(int side){ return side * 4; }
    public static int squareArea(int side){ return side * side; }

    /*5*/
    public static double converSecondsToMinutes( int seconds){ return seconds / 60.0; }

    /*6*/
    public static double averageSpeed(double distance, double time){
        if(time==0){return -1; }
        return distance / time;
    }

    /*7*/
    public static double findHypotenuse( double a, double b){
        return Math.sqrt(a * a + b * b);
    }

    /*8*/
    public static double circleCircumference( double radius){ return 2 * Math.PI * radius; }

    /*9*/
    public static double calculatePercentage(double total, double part){ return (part / total) * 100; }

    /*10*/
    public static double celsiusToFahrenheit(double c){ return c * 9 / 5 + 32; }

    public static double fahrenheitToCelsius(double f){ return (f - 32) * 5 / 9; }



    public static void main (String[] arr){

        /*1*/
        System.out.println("Addition method: " + add(1,1));
        System.out.println("Subtraction method: " + subtract(5,1));
        System.out.println("Multiplication method: " + multiply(1,1));
        System.out.println("Division method: " + divide(19,7));

        /*2*/
        System.out.println("Max of two nums is : " + findMax(2,3));

        /*3*/
        System.out.println("Addition method: " + difference(7,19));

        /*4*/
        System.out.println("squareArea: " + squareArea(4));
        System.out.println("squarePerimeter: " + squarePerimeter(4));

        /*5*/
        System.out.println("secondsToMinutes: " + converSecondsToMinutes(543));

        /*6*/
        System.out.println("avgSpeed: " + averageSpeed(100,13.4));
        System.out.println("avgSpeed With 0: " + averageSpeed(100,0));

        /*7*/
        System.out.println("Find Hypotenuse: " + findHypotenuse(3,5));

        System.out.println("Find Hypotenuse: " + findHypotenuse(6,10));

        /*8*/
        System.out.println("Circle Circumference: " + circleCircumference(14.2));
        System.out.println("Circle Circumference: " + circleCircumference(6.6));

        /*9*/
        System.out.println("Calculate Percentage: " + calculatePercentage(100.7,98.98));
        System.out.println("Calculate Percentage: " + calculatePercentage(150,135));

        /*10*/
        System.out.println("Celsius to Fahrenheit : " + celsiusToFahrenheit(36.6));
        System.out.println("Fahrenheit to Celsius: " + fahrenheitToCelsius(80));

    }


}
