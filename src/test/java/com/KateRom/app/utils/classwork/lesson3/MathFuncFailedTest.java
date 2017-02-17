package com.KateRom.app.utils.classwork.lesson3;

import org.junit.Assert;
import org.junit.Test;

public class MathFuncFailedTest {
    @Test //JUnit framework annotation
    public void multiplyTest() {
        int a = 2, b = 4, expRes = 8;
        Assert.assertEquals(expRes, MathFunc.multiply(a, b));
    }
}
