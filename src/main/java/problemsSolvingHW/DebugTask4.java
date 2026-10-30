package problemsSolvingHW;

public class DebugTask4 {
    public static void main(String[] args) {
        System.out.println(isPalindrome(null));
    }
    public static boolean isPalindrome (String str) {

        // Handle null explicitly by throwing IllegalArgumentException
        // instead of allowing StringBuilder to throw NullPointerException.

        if (str == null){
            throw new IllegalArgumentException("str can`t be null");
        }

        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }
}
