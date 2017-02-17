package com.KateRom.app.utils.homework.lesson4;

import org.junit.Assert;
import org.junit.Test;

public class CalculateBiggerAreaTest {
    @Test
    public void calculateBiggerAreaTest () {
        double radius1 = 8.6;
        double radius2 = 4.5;
        double expResult = 232.3;
        Assert.assertEquals(expResult, CalculateBiggerArea.calculateBiggerArea(radius1, radius2), 0.1);
    }
    @Test
    public void calculateBiggerAreaTest2 () {
        double radius1 = 4.5;
        double radius2 = 8.6;
        double expResult = 232.3;
        Assert.assertEquals(expResult, CalculateBiggerArea.calculateBiggerArea(radius1, radius2), 0.1);
    }
    @Test
    public void calculateBiggerAreaEqualTest () {
        double radius1 = 8.6;
        double radius2 = 8.6;
        double expResult = 464.7;
        Assert.assertEquals(expResult, CalculateBiggerArea.calculateBiggerArea(radius1, radius2), 0.1);
    }
    @Test
    public void calculateBiggerAreaZeroTest () {
        double radius1 = 0;
        double radius2 = 8.6;
        double expResult = 232.3;
        Assert.assertEquals(expResult, CalculateBiggerArea.calculateBiggerArea(radius1, radius2), 0.1);
    }
    @Test
    public void calculateBiggerAreaZeroMinusTest () {
        double radius1 = 0;
        double radius2 = -3;
        double expResult = 0.0;
        Assert.assertEquals(expResult, CalculateBiggerArea.calculateBiggerArea(radius1, radius2), 0.1);
    }
}
