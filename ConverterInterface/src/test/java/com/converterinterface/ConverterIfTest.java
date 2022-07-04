package com.converterinterface;

import org.junit.Test;

import static org.junit.Assert.*;

public class ConverterIfTest {




    @Test
    public void convertMonthTakesinIntandReturnsCorrectString() {
        ConverterIf tool = new ConverterIf();
        String expectedValue = "March";
        String actualValue = tool.convertMonth(3);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void convertMonthTakesoutofBoundsvalueandReturnsError() {
        ConverterIf tool = new ConverterIf();
        String expectedValue = "Enter a correct month number!";
        String actualValue = tool.convertMonth(23);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void convertDayTakesinIntandReturnsCorrectString() {
        ConverterIf tool = new ConverterIf();
        String expectedValue = "Tuesday";
        String actualValue = tool.convertDay(3);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void convertDayTakesoutofBoundsvalueandReturnsError() {
        ConverterIf tool = new ConverterIf();
        String expectedValue = "Enter a correct day number.";
        String actualValue = tool.convertDay(23);
        assertEquals(expectedValue, actualValue);
    }

}