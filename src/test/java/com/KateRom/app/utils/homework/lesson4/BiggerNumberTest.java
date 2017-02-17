package com.KateRom.app.utils.homework.lesson4;

import org.junit.Assert;
import org.junit.Test;

public class BiggerNumberTest {
    @Test
    public void whatNumberBiggerTest () {
        double a = 4.5;
        double b = 3.5;
        double expResult = 4.5;
        Assert.assertEquals(expResult, BiggerNumber.whatNumberBigger(a, b), 0);
    }
    @Test
    public void whatNumberBiggerTest2 () {
        double a = 4.5;
        double b = 10.88;
        double expResult = 10.88;
        Assert.assertEquals(expResult, BiggerNumber.whatNumberBigger(a, b), 0);
    }
    @Test
    public void whatNumberBiggerEqualTest () {
        double a = 4.5;
        double b = 4.5;
        double expResult = 9;
        Assert.assertEquals(expResult, BiggerNumber.whatNumberBigger(a, b), 0);
    }
}
