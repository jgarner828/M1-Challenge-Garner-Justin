package com.rgpinheritance;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConstableTest {

    Constable tim;

    @Before
    public void setUp() {
        tim = new Constable();
    }



    @Test
    public void attack() {
        Warrior scumbag = new Warrior();
        tim.attack(scumbag);
        int actualValue = scumbag.getHealth();
        int expectedValue = 95;
        assertEquals(expectedValue, actualValue);
    }


    @Test
    public void arrestCharacter() {

//        Constable has jurisdiction to arrest
        tim.setJurisdiction(true);
        Warrior warcriminal = new Warrior();
        tim.arrestCharacter(warcriminal);
        boolean actualValue = warcriminal.isArrested();
        assertEquals(true, actualValue);

//        constable does not have jursdiction to arrest
        tim.setJurisdiction(false);
        Farmer justDoingHisWork = new Farmer();
        tim.arrestCharacter(justDoingHisWork);
        assertEquals(false, justDoingHisWork.isArrested());



    }
}