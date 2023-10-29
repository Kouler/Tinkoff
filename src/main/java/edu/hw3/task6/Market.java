package edu.hw3.task6;

import java.util.PriorityQueue;
import java.util.Queue;

public class Market implements StockMarket {
    private final Queue<Stock> queue = new PriorityQueue<>();

    public Market() {

    }

    @Override
    public void add(Stock stock) {
        queue.add(stock);
    }

    @Override
    public void remove(Stock stock) {
        queue.remove(stock);
    }

    @Override
    public Stock mostValuableStock() {
        return queue.peek();
    }

    public Queue<Stock> getQueue() {
        return queue;
    }
}
