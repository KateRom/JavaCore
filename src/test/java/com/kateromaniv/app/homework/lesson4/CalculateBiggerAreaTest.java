package com.kateromaniv.app.homework.lesson4;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculateBiggerAreaTest {
    CalculateBiggerArea calculateBiggerArea;

    @Before
    public void setUp() {
        calculateBiggerArea = new CalculateBiggerArea();
    }
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
        double expResult = 0.0;
        Assert.assertEquals(expResult, CalculateBiggerArea.calculateBiggerArea(radius1, radius2), 0.1);
    }
    @Test
    public void calculateBiggerAreaFalseTest () {
        double radius1 = 8.6;
        double radius2 = 3.0;
        double expResult = 0.0;
        Assert.assertNotEquals(expResult, CalculateBiggerArea.calculateBiggerArea(radius1, radius2), 0.1);
    }
    @Test(timeout = 10)
    public void calculateBiggerAreaZeroTest () {
        double radius1 = 0;
        double radius2 = 8.6;
        double expResult = 0.0;
        Assert.assertEquals(expResult, CalculateBiggerArea.calculateBiggerArea(radius1, radius2), 0.1);
    }
    @Test
    public void calculateBiggerAreaZeroMinusTest () {
        double radius1 = 0;
        double radius2 = -3;
        double expResult = 0.0;
        Assert.assertEquals(expResult, CalculateBiggerArea.calculateBiggerArea(radius1, radius2), 0.1);
    }
    @Test
    public void calculateBiggerAreaZeroZeroTest () {
        double radius1 = 0;
        double radius2 = 0;
        double expResult = 0.0;
        Assert.assertEquals(expResult, CalculateBiggerArea.calculateBiggerArea(radius1, radius2), 0.1);
    }
}
