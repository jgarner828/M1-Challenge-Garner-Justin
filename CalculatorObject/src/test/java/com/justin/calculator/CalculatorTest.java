package com.justin.calculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void addAndReturnSumInt() {
        Calculator c = new Calculator();
        int expectedValue = 1;
        int actualValue  = c.add(0,1);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void addAndReturnDouble() {
        Calculator c = new Calculator();
        double expectedValue = 10.0;
        double actualValue  = c.add(5.0,5.0);
        assertEquals(expectedValue, actualValue, 0.001);
    }

    @Test
    public void subtractAndReturnInt() {
        Calculator c = new Calculator();
        int expectedValue = 1;
        int actualValue  = c.subtract(3,2);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void subtractAndReturnDouble() {
        Calculator c = new Calculator();
        double expectedValue = 10.0;
        double actualValue  = c.subtract(15.0,5.0);
        assertEquals(expectedValue, actualValue, 0.001);
    }

    @Test
    public void multiplyAndReturnInt() {
        Calculator c = new Calculator();
        int expectedValue = 4;
        int actualValue  = c.multiply(2,2);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void multiplyAndReturnDouble() {
        Calculator c = new Calculator();
        double expectedValue = 10.0;
        double actualValue  = c.multiply(5.0,2.0);
        assertEquals(expectedValue, actualValue, 0.001);
    }

    @Test
    public void divideAndReturnInt() {
        Calculator c = new Calculator();
        int expectedValue = 1;
        int actualValue  = c.divide(2,2);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void divideAndReturnDouble() {
        Calculator c = new Calculator();
        double expectedValue = 10.0;
        double actualValue  = c.divide(20.0,2.0);
        assertEquals(expectedValue, actualValue, 0.001);
    }

}