package edu.hm2.task3.connections;

public interface Connection extends AutoCloseable {
    void execute(String command);
}
