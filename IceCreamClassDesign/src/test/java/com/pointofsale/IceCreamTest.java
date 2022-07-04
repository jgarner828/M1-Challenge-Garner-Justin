package com.pointofsale;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IceCreamTest {

    @Test
    public void addSprinkles() {
        IceCream icecream = new IceCream();
        double expectedValue = 1.00;
        icecream.addSprinkles();
        double actualValue = icecream.getTotalCost();
        assertEquals(expectedValue, actualValue, 0.01);
    }

    @Test
    public void addChocolate() {
        IceCream icecream = new IceCream();
        double expectedValue = 1.50;
        icecream.addChocolate();
        double actualValue = icecream.getTotalCost();
        assertEquals(expectedValue, actualValue, 0.01);
    }

    @Test
    public void addWaffleCone() {
        IceCream icecream = new IceCream();
        double expectedValue = 2.50;
        icecream.addWaffleCone();
        double actualValue = icecream.getTotalCost();
        assertEquals(expectedValue, actualValue, 0.01);
    }
}