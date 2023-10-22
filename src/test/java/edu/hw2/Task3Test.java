package edu.hw2;

import edu.hw2.task3.exceptions.ConnectionException;
import edu.hw2.task3.executors.PopularCommandExecutor;
import edu.hw2.task3.managers.DefaultConnectionManager;
import edu.hw2.task3.managers.FaultyConnectionManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Task3Test {

    final Logger LOGGER = LogManager.getLogger();

    @Test
    @DisplayName("Test the FaultyConnectionManager")
    void faulty_test() {
        PopularCommandExecutor executor = new PopularCommandExecutor(new FaultyConnectionManager());

        assertThrows(ConnectionException.class, executor::updatePackages);
    }
    @Test
    @DisplayName("Test the DefaultConnectionManager")
    void good_test() {
        PopularCommandExecutor executor = new PopularCommandExecutor((new DefaultConnectionManager()));

        assertDoesNotThrow(executor::updatePackages);
    }
}
