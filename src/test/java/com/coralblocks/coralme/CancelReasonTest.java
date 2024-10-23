package com.coralblocks.coralme;

import static org.junit.Assert.*;

import org.junit.Test;

public class CancelReasonTest {

    @Test
    public void testCancelReasonValues() {
        assertEquals(8, CancelReason.values().length);
        assertEquals(CancelReason.MISSED, CancelReason.valueOf("MISSED"));
        assertEquals(CancelReason.USER, CancelReason.valueOf("USER"));
        assertEquals(CancelReason.NO_LIQUIDITY, CancelReason.valueOf("NO_LIQUIDITY"));
        assertEquals(CancelReason.PRICE, CancelReason.valueOf("PRICE"));
        assertEquals(CancelReason.CROSSED, CancelReason.valueOf("CROSSED"));
        assertEquals(CancelReason.PURGED, CancelReason.valueOf("PURGED"));
        assertEquals(CancelReason.EXPIRED, CancelReason.valueOf("EXPIRED"));
        assertEquals(CancelReason.ROLLED, CancelReason.valueOf("ROLLED"));
    }

    @Test
    public void testGetChar() {
        assertEquals('M', CancelReason.MISSED.getChar());
        assertEquals('U', CancelReason.USER.getChar());
        assertEquals('L', CancelReason.NO_LIQUIDITY.getChar());
        assertEquals('E', CancelReason.PRICE.getChar());
        assertEquals('C', CancelReason.CROSSED.getChar());
        assertEquals('P', CancelReason.PURGED.getChar());
        assertEquals('D', CancelReason.EXPIRED.getChar());
        assertEquals('R', CancelReason.ROLLED.getChar());
    }

    @Test
    public void testCharMap() {
        for (CancelReason reason : CancelReason.values()) {
            assertEquals(reason, CancelReason.ALL.get(reason.getChar()));
        }
    }
}
