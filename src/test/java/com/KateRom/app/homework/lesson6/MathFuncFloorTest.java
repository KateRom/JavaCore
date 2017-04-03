package com.KateRom.app.homework.lesson6;

import com.KateRom.app.homework.lesson3.MathFunction;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class MathFuncFloorTest {
    private final static String RESOURCES_PATH = "src/test/java/resources/";
    MathFunction mathFunction;

    @Before
    public void setUp() {
        mathFunction = new MathFunction();
    }

    @FileParameters(RESOURCES_PATH + "floor_params.txt")

    @Test
    public void floorTest (double a, int expResult) {
        Assert.assertEquals(expResult, MathFunction.floor(a), 0.01);
    }
}
