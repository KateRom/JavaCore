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
public class MathFuncAbsoluteTest {
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
