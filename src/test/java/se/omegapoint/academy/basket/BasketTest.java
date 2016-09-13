package se.omegapoint.academy.basket;

import org.junit.Assert;
import org.junit.Test;
import se.omegapoint.academy.basket.items.Candy;

import java.util.HashSet;

import static org.junit.Assert.assertEquals;

public class BasketTest {

    Basket basket;

    private final double PRICE_WITHOUT_TAX = 25.0;
    private final double TAX = 0.125;
    private final double PRICE_WITH_TAX = PRICE_WITHOUT_TAX * (1.0 + TAX);

    @Test
    public void addElementToEmptySet() {
        // Given an empty set
        HashSet<Integer> set = new HashSet<Integer>();
        // When adding an element
        set.add(new Integer(0));
        // THen the set contains one element
        assertEquals("Add element to empty set test failed.", 1, set.size());
    }

    @Test
    public void removeFromSingletonSet() {
        // Given a set with one element
        HashSet<Integer> set = new HashSet<Integer>();
        Integer element = new Integer(0);
        set.add(element);
        // When removing the element
        set.remove(element);
        // Then the set is empty
        assertEquals("Remove element test failed.", 0, set.size());
    }

    @Test
    public void addItemToBasket() {
        basket = givenEmptyBasket();
        whenAddingAnItem();
        assertEquals("Basket does not contain one item.", 1, basket.size());
    }

    private Candy whenAddingAnItem() {
        Candy candy = new Candy(PRICE_WITHOUT_TAX, TAX);
        basket.add(candy);
        return candy;
    }

    private Basket givenEmptyBasket() {
        // Given an empty basket
        return new Basket();
    }

    @Test
    public void getPriceWithTax() {
        basket = givenEmptyBasket();
        Candy candy = whenAddingAnItem();
        Assert.assertEquals(PRICE_WITH_TAX, candy.getPriceWithTax(), 0.0);
    }
}