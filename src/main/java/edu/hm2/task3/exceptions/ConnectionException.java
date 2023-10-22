package edu.hm2.task3.exceptions;

public class ConnectionException extends RuntimeException {
    @Override
    public String getMessage() {
        return "[ERROR: Connection Exception appeared!!!] -- change your command and try again";
    }
}
