package problemsSolvingHW;

public class DebugTask8 {
    public static void main(String[] args) {
        double a = 0.1 * 3;
        double b = 0.3;

        double differance = Math.abs(a - b);
        double epsilon = 0.000001;

        if (differance <= epsilon) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
    }
}
