package ru.itsjava.exceptions;

public class IncorrectPersonAgeException extends RuntimeException{
    public IncorrectPersonAgeException(String message) {
        super(message);
    }
}
