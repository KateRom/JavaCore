package com.KateRom.app.utils.classwork.lesson2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WideningCastingTest {
    @Test
    public void wideningTest () {
       byte byte1 = 100;
       double expResult = 100.0d;
       WideningCasting casting1 = new WideningCasting();
       casting1.widening(byte1);
       assertEquals(expResult, casting1.widening(byte1), 0.1);
    }
}
