package edu.hw2.task3.connections;

import edu.hw2.task3.exceptions.ConnectionException;

public class FaultyConnection implements Connection {
    static int current = 0;
    final int probability = 3;

    @Override
    public void execute(String command) {
        current++;
        current %= probability;
    }

    @Override
    public void close() throws Exception {
        if (current != 0) {
            throw new ConnectionException();
        }
    }
}
