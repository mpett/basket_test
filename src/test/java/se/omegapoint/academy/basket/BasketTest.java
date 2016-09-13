package se.omegapoint.academy.basket;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;

public class BasketTest {

    @Test
    public void addElementToEmptySet() {
        // Given an empty set
        HashSet<Integer> set = new HashSet<Integer>();
        // When adding an element
        set.add(new Integer(0));
        // THen the set contains one element
        Assert.assertEquals("Add element to empty set test failed.", 1, set.size());
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
        Assert.assertEquals("Remove element test failed.", 0, set.size());
    }
}