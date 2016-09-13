package se.omegapoint.academy.basket;

import se.omegapoint.academy.basket.receipt.ReceiptLogger;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    private final List<Item> items = new ArrayList<>();
    private Logger logger = new ReceiptLogger();

    public Basket(Logger logger) {
        this.logger = logger;
    }

    public void add(Item item) {
        items.add(item);
        logger.add(item);
    }

    public void remove(Item item) {
        items.remove(item);
        logger.add(item);
    }

    public int size() {
        return items.size();
    }
}
