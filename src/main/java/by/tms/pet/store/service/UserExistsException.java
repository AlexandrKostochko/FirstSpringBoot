package by.tms.pet.store.service;

public class UserExistsException extends RuntimeException{

    public UserExistsException() {
    }

    public UserExistsException(String message) {
        super(message);
    }
}
