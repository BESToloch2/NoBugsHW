package practice_8.exceptions;

public class InvalidBookException extends RuntimeException {
    public InvalidBookException (String message){
        super(message);
    }
}
