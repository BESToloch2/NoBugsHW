package exceptionsAndGenerics.exceptions.task4;

public class InvalidEmailException extends RuntimeException {
    public InvalidEmailException(String message){
        super(message);
    }
}
