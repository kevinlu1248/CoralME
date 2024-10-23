package com.coralblocks.coralme;

import static org.junit.Assert.*;

import org.junit.Test;

public class ExecuteSideTest {

    @Test
    public void testExecuteSideValues() {
        assertEquals(2, ExecuteSide.values().length);
        assertEquals(ExecuteSide.TAKER, ExecuteSide.valueOf("TAKER"));
        assertEquals(ExecuteSide.MAKER, ExecuteSide.valueOf("MAKER"));
    }

    @Test
    public void testGetChar() {
        assertEquals('T', ExecuteSide.TAKER.getChar());
        assertEquals('M', ExecuteSide.MAKER.getChar());
    }

    @Test
    public void testFromFixCode() {
        assertEquals(ExecuteSide.TAKER, ExecuteSide.fromFixCode("Y"));
        assertEquals(ExecuteSide.MAKER, ExecuteSide.fromFixCode("N"));
        assertNull(ExecuteSide.fromFixCode("X"));
    }

    @Test
    public void testGetFixCode() {
        assertEquals("Y", ExecuteSide.TAKER.getFixCode());
        assertEquals("N", ExecuteSide.MAKER.getFixCode());
    }
}
