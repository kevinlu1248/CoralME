package com.coralblocks.coralme;

import static org.junit.Assert.*;

import org.junit.Test;

public class TimeInForceTest {

    @Test
    public void testTimeInForceValues() {
        assertEquals(3, TimeInForce.values().length);
        assertEquals(TimeInForce.GTC, TimeInForce.valueOf("GTC"));
        assertEquals(TimeInForce.IOC, TimeInForce.valueOf("IOC"));
        assertEquals(TimeInForce.DAY, TimeInForce.valueOf("DAY"));
    }

    @Test
    public void testGetChar() {
        assertEquals('T', TimeInForce.GTC.getChar());
        assertEquals('I', TimeInForce.IOC.getChar());
        assertEquals('D', TimeInForce.DAY.getChar());
    }

    @Test
    public void testFromFixCode() {
        assertEquals(TimeInForce.GTC, TimeInForce.fromFixCode("1"));
        assertEquals(TimeInForce.IOC, TimeInForce.fromFixCode("3"));
        assertEquals(TimeInForce.DAY, TimeInForce.fromFixCode("0"));
        assertNull(TimeInForce.fromFixCode("2"));
    }

    @Test
    public void testGetFixCode() {
        assertEquals("1", TimeInForce.GTC.getFixCode());
        assertEquals("3", TimeInForce.IOC.getFixCode());
        assertEquals("0", TimeInForce.DAY.getFixCode());
    }
}
