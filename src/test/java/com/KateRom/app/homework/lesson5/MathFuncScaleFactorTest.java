package com.KateRom.app.homework.lesson5;

import com.KateRom.app.homework.lesson3.MathFunction;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class MathFuncScaleFactorTest {
    private final static String RESOURCES_PATH = "src/test/java/resources/";
    MathFunction mathFunction;

    @Before
    public void setUp(){mathFunction = new MathFunction();}

    @FileParameters(RESOURCES_PATH + "scale_factor_params.txt")

    @Test
    public void scaleFactorTest (double a, int b, double expResult) {
        Assert.assertEquals(expResult, MathFunction.scaleFactor(a, b), 0.1);
    }
}
