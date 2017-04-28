package com.kateromaniv.app.homework.lesson3;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static com.kateromaniv.app.utils.Consts.RESOURCES_PATH;

@RunWith(JUnitParamsRunner.class)

public class MathFunctionTest {
    MathFunction mathFunction;

    @Before
    public void setUp(){
        mathFunction = new MathFunction();
    }

    @FileParameters(RESOURCES_PATH + "multiply_params.csv")

    @Test
    public void devisiontest (double a, double b, double expResult, boolean isTrue) {
        Assert.assertEquals(isTrue,expResult == MathFunction.division(a,b));
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
    @Test
    public  void theSmallestTest () {
        float a = 88.994f;
        float b = 88.94f;
        float expResult = 88.94f;
        Assert.assertEquals(expResult, MathFunction.theSmallest(a, b), 0.001);
    }
    @Test
    public void nextPointTest () {
        float a = 78.669f;
        double b = 4.6;
        float expResult = 78.669f;
        Assert.assertEquals(expResult, MathFunction.nextPoint(a, b), 0.005);
    }
    @Test
    public void scaleFactorTest () {
        double a = 4.3;
        int b = 5;
        double expResult = 137.6;
        Assert.assertEquals(expResult, MathFunction.scaleFactor(a, b), 0.1);
    }
    @Test
    public void signumTest () {
        float a = -99.0f;
        float expResult = -1.0f;
        Assert.assertEquals(expResult, MathFunction.signum(a), 0.1);
    }
    @Test
    public void powerArgTest () {
        double a = 22.36;
        double b = 1.0;
        double expResult = 22.36;
        Assert.assertEquals(expResult, MathFunction.powerArg(a, b), 0.1);
    }
}
