package com.pointofsale;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IceCreamTest {


    @Test
    public void getFlavor() {
        IceCream icecream = new IceCream();
        icecream.setFlavor("Vanilla");
        String expectedValue = "Vanilla";
        String actualValue = icecream.getFlavor();
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void setFlavor() {
        IceCream icecream = new IceCream();
        icecream.setFlavor("Chocolate");
        String expectedValue = "Chocolate";
        String actualValue = icecream.getFlavor();
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void getPricePerScoop() {
        IceCream icecream = new IceCream();
        icecream.setPricePerScoop(2.00);
        double expectedValue = icecream.getPricePerScoop();
        double actualValue = icecream.getPricePerScoop();
        assertEquals(expectedValue, actualValue, 0.001);

    }

    @Test
    public void setPricePerScoop() {
        IceCream icecream = new IceCream();
        double expectedValue = 2.00;
        icecream.setPricePerScoop(2.00);
        double actualValue = icecream.getPricePerScoop();
        assertEquals(expectedValue, actualValue, 0.001);
    }

    @Test
    public void getScoops() {
        IceCream icecream = new IceCream();
        icecream.setScoops(2);
        int expectedValue = 2;
        int actualValue = icecream.getScoops();
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void setScoops() {
        IceCream icecream = new IceCream();
        icecream.setScoops(3);
        int expectedValue = 3;
        int actualValue = icecream.getScoops();
        assertEquals(expectedValue, actualValue);
    }

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