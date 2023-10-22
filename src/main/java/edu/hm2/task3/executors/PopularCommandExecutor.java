package edu.hm2.task3.executors;

import edu.hm2.task3.connections.Connection;
import edu.hm2.task3.managers.ConnectionManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class PopularCommandExecutor {
    private final ConnectionManager manager;
    private final int maxAttempts = 2;
    private final static Logger LOGGER = LogManager.getLogger();

    public PopularCommandExecutor(ConnectionManager manager) {
        this.manager = manager;
    }

    public void updatePackages() {
        tryExecute("apt update && apt upgrade -y");
    }

    public void tryExecute(String command) {
        int attempt = 0;
        while (true) {
            try (Connection connection = manager.getConnection()) {
                connection.execute(command);
                break;
            } catch (Exception e) {
                attempt++;
                LOGGER.info("Attempt " + Integer.toString(attempt) + ": fault!");
                if (attempt == maxAttempts) {
                    throw (RuntimeException) e;
                }
            }
        }
    }
}
