package com.kateromaniv.app.homework.lesson6;

import com.kateromaniv.app.homework.lesson3.MathFunction;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static com.kateromaniv.app.utils.Consts.RESOURCES_PATH;

@RunWith(JUnitParamsRunner.class)
public class MathFuncFloorTest {
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
