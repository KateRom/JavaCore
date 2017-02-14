package com.KateRom.app.homework.Lesson3;

import org.junit.Assert;
import org.junit.Test;

public class MathFunctionTest {
    @Test
    public void devisiontest () {
        double a = 9.9, b = 3.3;
        double expResult = 3.;
        Assert.assertEquals(expResult, MathFunction.devidion(a,b), 0.0001);
    }
    @Test
    public void squareTest () {
        int a = 4;
        int expResult = 16;
        Assert.assertEquals(expResult, MathFunction.square(a));
    }
    @Test
    public void squareRootTest () {
        double a = 102.01;
        double expResult = 10.1;
        Assert.assertEquals(expResult, MathFunction.squareRoot(a), 0.01);
    }
    @Test
    public void absoluteTest () {
        float a = -888.99f;
        float expResult = 888.99f;
        Assert.assertEquals(expResult, MathFunction.absolute(a), 0.0005);
    }
    @Test
    public void floorTest () {
        double a = 44.85;
        int expResult = 44;
        Assert.assertEquals(expResult, MathFunction.floor(a), 0.01);
    }
}
