package com.kateromaniv.app.classwork.lesson2;

import org.junit.Assert;
import org.junit.Test;

public class NarrowingCastingTest {
    @Test
    public void narrowingTest(){
        float float1 = 6.3f;
        int expResult = 6;
        NarrowingCasting toNarrow = new NarrowingCasting();
        toNarrow.narrowing(float1);
        Assert.assertEquals(expResult,toNarrow.narrowing(float1));
    }
}
