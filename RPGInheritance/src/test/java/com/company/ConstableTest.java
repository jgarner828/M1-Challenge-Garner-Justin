package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class ConstableTest {

    @Test
    public void getNameofConstable() {
        Constable tim = new Constable();
        tim.setName("Tim");

        String expectedValue = "Tim";
        String actualValue = tim.getName();
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void setNameofConstable() {
        Constable tim = new Constable();
        tim.setName("Tim");
        tim.setName("Jim");
        String expectedValue = "Jim";
        String actualValue = tim.getName();
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void getStrength() {
        Constable tim = new Constable();
        tim.setStrength(10000);
        int expectedValue = 10000;
        int actualValue = tim.getStrength();
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void setStrength() {
        Constable tim = new Constable();
        tim.setStrength(99999);
        tim.setStrength(10000);
        int expectedValue = 10000;
        int actualValue = tim.getStrength();
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void getHealth() {
        Constable tim = new Constable();
        tim.setHealth(99);
        int expectedValue = 99;
        int actualValue = tim.getHealth();
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void setHealth() {
        Constable tim = new Constable();
        tim.setHealth(10);
        int expectedValue = 10;
        int actualValue = tim.getHealth();
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void getStamina() {
        Constable tim = new Constable();
        tim.setStamina(10);
        int expectedValue = 10;
        int actualValue = tim.getStamina();
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void setStamina() {
        Constable tim = new Constable();
        tim.setStamina(100);
        int expectedValue = 100;
        int actualValue = tim.getStamina();
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void getSpeed() {
        Constable tim = new Constable();
        tim.setSpeed(20);
        int expectedValue = 20;
        int actualValue = tim.getSpeed();
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void setSpeed() {
        Constable tim = new Constable();
        tim.setSpeed(200);
        int expectedValue = 200;
        int actualValue = tim.getSpeed();
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void getAttackPower() {
        Constable tim = new Constable();
        tim.setAttackPower(999);
        int expectedValue = 999;
        int actualValue = tim.getAttackPower();
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void setAttackPower() {
        Constable tim = new Constable();
        tim.setAttackPower(2000);
        int expectedValue = 2000;
        int actualValue = tim.getAttackPower();
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void isRunning() {
        Constable tim = new Constable();
        tim.setRunning(true);
        boolean expectedValue = true;
        boolean actualValue = tim.isRunning();
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void setRunning() {
        Constable tim = new Constable();
        tim.setRunning(false);
        boolean expectedValue = false;
        boolean actualValue = tim.isRunning();
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void isArrested() {
        Constable tim = new Constable();
        tim.setArrested(false);
        boolean expectedValue = false;
        boolean actualValue = tim.isArrested();
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void setArrested() {
        Constable tim = new Constable();
        tim.setArrested(true);
        boolean expectedValue = true;
        boolean actualValue = tim.isArrested();
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void attack() {
        Constable tim = new Constable();
    }

    @Test
    public void getJurisdiction() {
        Constable tim = new Constable();
    }

    @Test
    public void setJurisdiction() {
        Constable tim = new Constable();
    }

    @Test
    public void arrestCharacter() {
        Constable tim = new Constable();
        Warrior warcriminal = new Warrior();
        tim.arrestCharacter(warcriminal);
        boolean expectedValue = true;
        boolean actualValue = warcriminal.isArrested();
        assertEquals(expectedValue, actualValue);
    }
}