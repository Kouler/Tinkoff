package edu.hw2.task3.managers;

import edu.hw2.task3.connections.Connection;
import edu.hw2.task3.connections.FaultyConnection;
import edu.hw2.task3.connections.StableConnection;

public class DefaultConnectionManager implements ConnectionManager {
    static int current = 0;
    final int probability = 3;

    @Override
    public Connection getConnection() {
        //устроил тут якобы вероятность, а именно каждый третий, просто по модулю
        //возвращает мне плохое соединение
        current++;
        current %= probability;
        if (current == 0) {
            return new FaultyConnection();
        } else {
            return new StableConnection();
        }
    }
}
