package ro.cognizant.coderun2023.exception;

public class BookPublNotFound extends RuntimeException{
    public BookPublNotFound(String message) {
        super(message);
    }
}
