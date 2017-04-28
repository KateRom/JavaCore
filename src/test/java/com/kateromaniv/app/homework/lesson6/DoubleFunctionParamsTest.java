package com.kateromaniv.app.homework.lesson6;


import com.kateromaniv.app.homework.lesson3.DoubleFunction;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static com.kateromaniv.app.utils.Consts.RESOURCES_PATH;

@RunWith(JUnitParamsRunner.class)

public class DoubleFunctionParamsTest {
    DoubleFunction doubleFunction;

    @Before
    public void setUp(){doubleFunction = new DoubleFunction();}

    @FileParameters(RESOURCES_PATH + "double_function_params.txt")

    @Test
    public void doubleEqualsTest (double obj1, double obj2, boolean expResult) {
        Assert.assertEquals(expResult, DoubleFunction.doubleEquals(obj1, obj2));
    }
}
