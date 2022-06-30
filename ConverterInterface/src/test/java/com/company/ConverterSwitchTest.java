package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class ConverterSwitchTest {



    @Test
    public void convertMonthTakesinIntandReturnsCorrectString() {
        ConverterSwitch tool = new ConverterSwitch();
        String expectedValue = "March";
        String actualValue = tool.convertMonth(3);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void convertMonthTakesoutofBoundsvalueandReturnsError() {
        ConverterSwitch tool = new ConverterSwitch();
        String expectedValue = "Invalid month number.";
        String actualValue = tool.convertMonth(23);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void convertDayTakesinIntandReturnsCorrectString() {
        ConverterSwitch tool = new ConverterSwitch();
        String expectedValue = "Tuesday";
        String actualValue = tool.convertDay(3);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void convertDayTakesoutofBoundsvalueandReturnsError() {
        ConverterSwitch tool = new ConverterSwitch();
        String expectedValue = "Invalid day number.";
        String actualValue = tool.convertDay(23);
        assertEquals(expectedValue, actualValue);
    }


}