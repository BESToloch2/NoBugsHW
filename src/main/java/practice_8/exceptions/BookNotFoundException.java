package practice_8.exceptions;

public class BookNotFoundException extends Exception {
    public BookNotFoundException(String message){
        super(message);
    }
}
