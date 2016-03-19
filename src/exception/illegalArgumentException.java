package exception;

public class IllegalArgumentException extends Throwable {
    public IllegalArgumentException(String illegalArgument) {
        super(illegalArgument);
    }
}
