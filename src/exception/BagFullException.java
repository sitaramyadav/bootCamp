package exception;

public class BagFullException extends RuntimeException{

    public BagFullException(String message){
        super(message);
    }
}
