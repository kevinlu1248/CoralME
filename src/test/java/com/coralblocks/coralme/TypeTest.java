package com.coralblocks.coralme;

import static org.junit.Assert.*;

import org.junit.Test;

public class TypeTest {

    @Test
    public void testTypeValues() {
        assertEquals(2, Type.values().length);
        assertEquals(Type.MARKET, Type.valueOf("MARKET"));
        assertEquals(Type.LIMIT, Type.valueOf("LIMIT"));
    }

    @Test
    public void testGetChar() {
        assertEquals('M', Type.MARKET.getChar());
        assertEquals('L', Type.LIMIT.getChar());
    }

    @Test
    public void testFromFixCode() {
        assertEquals(Type.MARKET, Type.fromFixCode("1"));
        assertEquals(Type.LIMIT, Type.fromFixCode("2"));
        assertNull(Type.fromFixCode("3"));
    }

    @Test
    public void testGetFixCode() {
        assertEquals("1", Type.MARKET.getFixCode());
        assertEquals("2", Type.LIMIT.getFixCode());
    }
}
