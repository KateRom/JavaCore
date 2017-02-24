package com.KateRom.app.classwork.lesson3;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MathFuncTest {
    MathFunc mathFunc;

    @Before
    public void setUp() {
        mathFunc = new MathFunc();
    }

    @Test //JUnit framework annotation
    public void multiplyTest() {
        int a = 2, b = 3, expRes = 6;
        Assert.assertEquals(expRes, MathFunc.multiply(a, b));
    }
}


