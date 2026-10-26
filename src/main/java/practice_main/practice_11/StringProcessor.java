package practice_main.practice_11;

public class StringProcessor {

    //Method to revere string
    public String reverse(String input){
        if (input == null){
            throw new IllegalArgumentException("Input can`t be null");
        }
        return new StringBuilder(input).reverse().toString();
    }
}
