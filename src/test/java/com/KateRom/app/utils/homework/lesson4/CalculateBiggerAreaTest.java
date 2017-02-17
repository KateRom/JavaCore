package com.KateRom.app.utils.homework.lesson4;

import org.junit.Assert;
import org.junit.Test;

public class CalculateBiggerAreaTest {
    @Test
    public void calculateBiggerAteaTest () {
        double radius1 = 8.6;
        double radius2 = 4.5;
        double expResult = 232.3;
        Assert.assertEquals(expResult, CalculateBiggerArea.calculateBiggerArea(radius1, radius2), 0.1);
    }
    @Test
    public void calculateBiggerAteaTest2 () {
        double radius1 = 4.5;
        double radius2 = 8.6;
        double expResult = 232.3;
        Assert.assertEquals(expResult, CalculateBiggerArea.calculateBiggerArea(radius1, radius2), 0.1);
    }
    @Test
    public void calculateBiggerAteaEqualTest () {
        double radius1 = 8.6;
        double radius2 = 8.6;
        double expResult = 464.7;
        Assert.assertEquals(expResult, CalculateBiggerArea.calculateBiggerArea(radius1, radius2), 0.1);
    }
}
