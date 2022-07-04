package com.rgpinheritance;


import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class FarmerTest {

    Farmer tim;

    @Before
    public void setUp() throws Exception {
        tim = new Farmer();
    }

    @Test
    public void farmerCanPlowAField(){
        tim.setPlowing(true);
        assertEquals(true, tim.isPlowing());
    }


}