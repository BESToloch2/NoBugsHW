package junitHW;

public class Task3_StringReverse {
    public String reverse(String input) {
        if (input == null) return null;
        return new StringBuilder(input).reverse().toString();
    }

}
