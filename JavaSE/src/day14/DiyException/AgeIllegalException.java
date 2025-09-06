package day14.DiyException;

public class AgeIllegalException extends Exception{
    public AgeIllegalException() {

    }
    public AgeIllegalException(String message) {
        super(message);
    }
}
