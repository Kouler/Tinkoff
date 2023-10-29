package edu.hw3;

import edu.hw3.task6.Market;
import edu.hw3.task6.Stock;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.Date;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Task6Test {
    @Test
    @DisplayName("Test the Stock Market")
    void check_task6() {
        Stock[] stocks = {
            new Stock("Тинькофф Вечный портфель", "Jonathan", 7, new Date(2022, 12, 23)),
            new Stock("RussianFederationStock", "Nathan", 123456789, new Date()),
            new Stock("UltraStock", "Marakuya", 12, new Date(12434234234L)),
            new Stock("miniStock", "Ivanchai", 1, new Date(212312))
        };

        Market market = new Market();
        market.add(stocks[0]);
        market.add(stocks[1]);
        market.add(stocks[2]);

        assertThat(market.mostValuableStock())
            .isEqualTo(stocks[1]);

        market.remove(stocks[1]);

        assertThat(market.mostValuableStock())
            .isEqualTo(stocks[2]);

        market.add(stocks[3]);

        assertThat(market.mostValuableStock())
            .isEqualTo(stocks[2]);

        market.remove(stocks[2]);

        assertThat(market.mostValuableStock())
            .isEqualTo(stocks[0]);

        market.remove(stocks[0]);

        assertThat(market.mostValuableStock())
            .isEqualTo(stocks[3]);

        market.remove(stocks[3]);

        assertThat(market.mostValuableStock())
            .isEqualTo(null);


    }
}
