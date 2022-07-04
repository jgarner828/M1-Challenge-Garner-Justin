package com.rgpinheritance;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WarriorTest {

    Warrior jimmybobby;

    @Before
    public void setUp() throws Exception {
        jimmybobby = new Warrior();
    }

    @Test
    public void checkshieldstrength() {
        int expectedValue = 100;
        int actualValue = jimmybobby.getShieldStrength();
        assertEquals(expectedValue, actualValue);
    }




}