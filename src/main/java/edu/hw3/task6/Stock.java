package edu.hw3.task6;

import java.util.Date;
import org.jetbrains.annotations.NotNull;

public record Stock(String name, String owner, int price, Date date) implements Comparable<Stock> {
    @Override
    public int compareTo(@NotNull Stock o) {
        return o.price - this.price;
    }
}
