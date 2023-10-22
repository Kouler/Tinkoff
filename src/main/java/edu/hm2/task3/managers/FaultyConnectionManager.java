package edu.hm2.task3.managers;

import edu.hm2.task3.connections.Connection;
import edu.hm2.task3.connections.FaultyConnection;

public class FaultyConnectionManager implements ConnectionManager {
    @Override
    public Connection getConnection() {
        return new FaultyConnection();
    }
}
