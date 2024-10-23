package com.coralblocks.coralme;

import static org.junit.Assert.*;

import org.junit.Test;

public class CancelRejectReasonTest {

    @Test
    public void testCancelRejectReasonValues() {
        assertEquals(1, CancelRejectReason.values().length);
        assertEquals(CancelRejectReason.NOT_FOUND, CancelRejectReason.valueOf("NOT_FOUND"));
    }

    @Test
    public void testGetChar() {
        assertEquals('F', CancelRejectReason.NOT_FOUND.getChar());
    }

    @Test
    public void testCharMap() {
        for (CancelRejectReason reason : CancelRejectReason.values()) {
            assertEquals(reason, CancelRejectReason.ALL.get(reason.getChar()));
        }
    }
}
