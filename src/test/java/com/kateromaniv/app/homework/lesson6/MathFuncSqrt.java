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
public class MathFuncSqrt {
    MathFunction mathFunction;

    @Before
    public void setUp(){ mathFunction = new MathFunction();}

    @FileParameters(RESOURCES_PATH + "sqrt_params.txt")

    @Test
    public void squareRootTest (double a, double expResult) {
        Assert.assertEquals(expResult, MathFunction.squareRoot(a), 0.01);
    }
}
