package com.coralblocks.coralme;

import static org.junit.Assert.*;

import org.junit.Test;

public class RejectReasonTest {

    @Test
    public void testRejectReasonValues() {
        assertEquals(12, RejectReason.values().length);
        assertEquals(RejectReason.MISSING_FIELD, RejectReason.valueOf("MISSING_FIELD"));
        assertEquals(RejectReason.BAD_TYPE, RejectReason.valueOf("BAD_TYPE"));
        assertEquals(RejectReason.BAD_TIF, RejectReason.valueOf("BAD_TIF"));
        assertEquals(RejectReason.BAD_SIDE, RejectReason.valueOf("BAD_SIDE"));
        assertEquals(RejectReason.BAD_SYMBOL, RejectReason.valueOf("BAD_SYMBOL"));
        assertEquals(RejectReason.BAD_PRICE, RejectReason.valueOf("BAD_PRICE"));
        assertEquals(RejectReason.BAD_SIZE, RejectReason.valueOf("BAD_SIZE"));
        assertEquals(RejectReason.TRADING_HALTED, RejectReason.valueOf("TRADING_HALTED"));
        assertEquals(RejectReason.BAD_LOT, RejectReason.valueOf("BAD_LOT"));
        assertEquals(RejectReason.UNKNOWN_SYMBOL, RejectReason.valueOf("UNKNOWN_SYMBOL"));
        assertEquals(
                RejectReason.DUPLICATE_EXCHANGE_ORDER_ID,
                RejectReason.valueOf("DUPLICATE_EXCHANGE_ORDER_ID"));
        assertEquals(
                RejectReason.DUPLICATE_CLIENT_ORDER_ID,
                RejectReason.valueOf("DUPLICATE_CLIENT_ORDER_ID"));
    }

    @Test
    public void testGetChar() {
        assertEquals('1', RejectReason.MISSING_FIELD.getChar());
        assertEquals('2', RejectReason.BAD_TYPE.getChar());
        assertEquals('3', RejectReason.BAD_TIF.getChar());
        assertEquals('4', RejectReason.BAD_SIDE.getChar());
        assertEquals('5', RejectReason.BAD_SYMBOL.getChar());
        assertEquals('P', RejectReason.BAD_PRICE.getChar());
        assertEquals('S', RejectReason.BAD_SIZE.getChar());
        assertEquals('H', RejectReason.TRADING_HALTED.getChar());
        assertEquals('L', RejectReason.BAD_LOT.getChar());
        assertEquals('U', RejectReason.UNKNOWN_SYMBOL.getChar());
        assertEquals('E', RejectReason.DUPLICATE_EXCHANGE_ORDER_ID.getChar());
        assertEquals('C', RejectReason.DUPLICATE_CLIENT_ORDER_ID.getChar());
    }

    @Test
    public void testCharMap() {
        for (RejectReason reason : RejectReason.values()) {
            assertEquals(reason, RejectReason.ALL.get(reason.getChar()));
        }
    }
}
