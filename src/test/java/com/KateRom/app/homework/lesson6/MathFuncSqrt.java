package com.KateRom.app.homework.lesson6;

import com.KateRom.app.homework.lesson3.MathFunction;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class MathFuncSqrt {
    private final static String RESOURCES_PATH = "src/test/java/resources/";
    MathFunction mathFunction;

    @Before
    public void setUp(){ mathFunction = new MathFunction();}

    @FileParameters(RESOURCES_PATH + "sqrt_params.txt")

    @Test
    public void squareRootTest (double a, double expResult) {
        Assert.assertEquals(expResult, MathFunction.squareRoot(a), 0.01);
    }
}
