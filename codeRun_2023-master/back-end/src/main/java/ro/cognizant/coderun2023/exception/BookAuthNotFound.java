package ro.cognizant.coderun2023.exception;

public class BookAuthNotFound extends RuntimeException {
    public BookAuthNotFound(String message) {
        super(message);
    }
}