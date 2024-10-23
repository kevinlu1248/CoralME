package com.coralblocks.coralme;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReduceRejectReasonTest {

    @Test
    public void testReduceRejectReasonValues() {
        assertEquals(5, ReduceRejectReason.values().length);
        assertEquals(ReduceRejectReason.ZERO, ReduceRejectReason.valueOf("ZERO"));
        assertEquals(ReduceRejectReason.NEGATIVE, ReduceRejectReason.valueOf("NEGATIVE"));
        assertEquals(ReduceRejectReason.INCREASE, ReduceRejectReason.valueOf("INCREASE"));
        assertEquals(ReduceRejectReason.SUPERFLUOUS, ReduceRejectReason.valueOf("SUPERFLUOUS"));
        assertEquals(ReduceRejectReason.NOT_FOUND, ReduceRejectReason.valueOf("NOT_FOUND"));
    }

    @Test
    public void testGetChar() {
        assertEquals('Z', ReduceRejectReason.ZERO.getChar());
        assertEquals('N', ReduceRejectReason.NEGATIVE.getChar());
        assertEquals('I', ReduceRejectReason.INCREASE.getChar());
        assertEquals('S', ReduceRejectReason.SUPERFLUOUS.getChar());
        assertEquals('F', ReduceRejectReason.NOT_FOUND.getChar());
    }

    @Test
    public void testCharMap() {
        for (ReduceRejectReason reason : ReduceRejectReason.values()) {
            assertEquals(reason, ReduceRejectReason.ALL.get(reason.getChar()));
        }
    }
}
