package problemsSolvingHW;

public class DebugTask6 {
    public static void main(String[] args) {
        countdown(1);
    }
    public static void countdown(int n) {

        if (n <= 0){
            throw new IllegalArgumentException("The number can`t be negative or zero");
        }

            System.out.println(n);
            if(n != 1) {
                countdown(n - 1);
            }
    }
}
