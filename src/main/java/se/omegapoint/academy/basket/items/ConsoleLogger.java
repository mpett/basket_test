package se.omegapoint.academy.basket.items;

import se.omegapoint.academy.basket.Item;
import se.omegapoint.academy.basket.Logger;

/**
 * Created by martinpettersson on 13/09/16.
 */
public class ConsoleLogger implements Logger {
    @Override
    public void add(Item item) {
        System.out.println("Added item with price " + item.getPriceWithTax());
    }

    @Override
    public void remove(Item item) {
        System.out.println("Removed item with price " + item.getPriceWithTax());
    }
}
