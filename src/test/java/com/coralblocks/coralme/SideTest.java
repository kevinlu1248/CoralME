package com.coralblocks.coralme;

import static org.junit.Assert.*;

import org.junit.Test;

public class SideTest {

    @Test
    public void testSideValues() {
        assertEquals(2, Side.values().length);
        assertEquals(Side.BUY, Side.valueOf("BUY"));
        assertEquals(Side.SELL, Side.valueOf("SELL"));
    }

    @Test
    public void testGetChar() {
        assertEquals('B', Side.BUY.getChar());
        assertEquals('S', Side.SELL.getChar());
    }

    @Test
    public void testFromFixCode() {
        assertEquals(Side.BUY, Side.fromFixCode("1"));
        assertEquals(Side.SELL, Side.fromFixCode("2"));
        assertNull(Side.fromFixCode("3"));
    }

    @Test
    public void testIndex() {
        assertEquals(0, Side.BUY.index());
        assertEquals(1, Side.SELL.index());
    }

    @Test
    public void testInvertedIndex() {
        assertEquals(1, Side.BUY.invertedIndex());
        assertEquals(0, Side.SELL.invertedIndex());
    }

    @Test
    public void testIsBuyAndIsSell() {
        assertTrue(Side.BUY.isBuy());
        assertFalse(Side.BUY.isSell());
        assertFalse(Side.SELL.isBuy());
        assertTrue(Side.SELL.isSell());
    }

    @Test
    public void testIsOutside() {
        assertTrue(Side.BUY.isOutside(100, 101));
        assertFalse(Side.BUY.isOutside(101, 100));
        assertFalse(Side.SELL.isOutside(100, 101));
        assertTrue(Side.SELL.isOutside(101, 100));
    }

    @Test
    public void testIsInside() {
        assertFalse(Side.BUY.isInside(100, 101));
        assertTrue(Side.BUY.isInside(101, 100));
        assertTrue(Side.SELL.isInside(100, 101));
        assertFalse(Side.SELL.isInside(101, 100));
    }
}
