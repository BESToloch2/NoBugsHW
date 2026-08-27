package accessModifiersStFl;

public class MathConstants {
    final static double PI = 3.14159;
    final static double E = 2.71828;

    static double calculateCircleArea(double r){
        return r * r * PI;
    }

    static double calculateCircleCircumference(double r){
        return 2 * PI * r;
    }

    static double calculateExponentialGrowth(double initialValue, double rate, double time){
        return initialValue * Math.pow(E, rate * time);
    }

    public static void main(String[] args) {
       double cA1 = MathConstants.calculateCircleArea(2.5);
       double cA2 = MathConstants.calculateCircleArea(5.2);

       double cC1 = MathConstants.calculateCircleCircumference(6.3);
       double cC2 = MathConstants.calculateCircleCircumference(3.6);

       double cExGh = MathConstants.calculateExponentialGrowth(5, 2.3, 1.5);

        System.out.println("Circle area with radius 2.5: " + cA1);
        System.out.println("Circle area with radius 5.2: " + cA2);

        System.out.println("Circle circumference with radius 6.3: " + cC1);
        System.out.println("Circle circumference with radius 3.6: " + cC2);

        System.out.println("Exponential growth: " + cExGh);
    }
}
