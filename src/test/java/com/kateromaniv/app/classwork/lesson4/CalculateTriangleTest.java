package com.kateromaniv.app.classwork.lesson4;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculateTriangleTest {
    CalculateTriangle calculateTriangle;

    @Before
    public void setUp(){
        calculateTriangle = new CalculateTriangle();
    }

    @Test
    public void isItRightAngledTrueTest() {
        double a = 3;
        double b = 4;
        double c = 5;
        Assert.assertEquals(true, CalculateTriangle.isITRightAngled(a, b, c));
    }

    @Test
    public void isItRightAngledFalseTest() {
        double a = 3.8;
        double b = 4.6;
        double c = 10.7;
        Assert.assertEquals(false, CalculateTriangle.isITRightAngled(a, b, c));
    }

    @Test
    public void isItRightAngledWithZeroTest() {
        double a = 0;
        double b = 4.6;
        double c = 10.7;
        Assert.assertEquals(false, CalculateTriangle.isITRightAngled(a, b, c));
    }

    @Test
    public void isItRightAngledWithZeroTest2() {
        double a = 0;
        double b = 0;
        double c = 0;
        Assert.assertEquals(false, CalculateTriangle.isITRightAngled(a, b, c));
    }
    @Test
    public void isItRightAngledWithZeroTest3 () {
        double a = 107.0;
        double b = 4.6;
        double c = 0;
        Assert.assertEquals(false, CalculateTriangle.isITRightAngled(a, b, c));
    }
    @Test
    public void isItRightAngledWithZeroTest4 () {
        double a = 107.0;
        double b = 0;
        double c = 4.6;
        Assert.assertEquals(false, CalculateTriangle.isITRightAngled(a, b, c));
    }
    @Test
    public void isItRightAngledMinusTest () {
        double a = -1;
        double b = -2;
        double c = -3;
        Assert.assertEquals(false, CalculateTriangle.isITRightAngled(a, b, c));
    }
    @Test
    public void isItRightAngledMinusTest2 () {
        double a = 20.6;
        double b = -2;
        double c = 40.6;
        Assert.assertEquals(false, CalculateTriangle.isITRightAngled(a, b, c));
    }
}

