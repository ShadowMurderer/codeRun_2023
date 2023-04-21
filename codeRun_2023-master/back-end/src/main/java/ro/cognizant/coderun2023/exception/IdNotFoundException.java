package ro.cognizant.coderun2023.exception;

public class IdNotFoundException extends RuntimeException{
    public IdNotFoundException(String message)
    {
        super(message);
    }
}
