package Exceptions;

public class GameMaxAttemptException extends Exception {
    public GameMaxAttemptException(String message) {
        super(message);
    }
}