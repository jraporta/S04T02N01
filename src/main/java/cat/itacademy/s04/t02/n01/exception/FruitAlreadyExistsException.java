package cat.itacademy.s04.t02.n01.exception;

public class FruitAlreadyExistsException extends RuntimeException{
    public FruitAlreadyExistsException(String message) {
        super(message);
    }
}