package com.factory;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IceCreamTest {

    IceCream iceCream;

    @Before
    public void setUp(){
        iceCream = new IceCream();
    }

     @Test
    public void temperatureCheckshouldreturnfalsebydefault() {
         String expectedValue = "Temperature is good!";
         assertEquals(expectedValue, iceCream.temperatureCheck());  }

    @Test
    public void discountPrice() {
        iceCream.setSalePrice(10.00);
        iceCream.discountPrice();
        double expectedValue = 9;
        assertEquals(expectedValue, iceCream.getSalePrice(), 0);
    }
}