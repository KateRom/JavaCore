package com.KateRom.app.homework.lesson5;

import com.KateRom.app.homework.lesson3.MathFunction;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class MathFuncAbsoluteTest {
    private final static String RESOURCES_PATH = "src/test/java/resources/";
    MathFunction mathFunction;

    @Before
    public void setUp(){
        mathFunction = new MathFunction();
    }

    @FileParameters(RESOURCES_PATH + "absolute_params.txt")

    @Test
    public void absoluteTest (float a, float expResult) {
        Assert.assertEquals(expResult, MathFunction.absolute(a), 0.0005);
    }
}
