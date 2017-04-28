package com.kateromaniv.app.classwork.lesson9;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static com.kateromaniv.app.utils.Consts.RESOURCES_PATH;

/*Created by katr on 28.04.2017.
 */

@RunWith(JUnitParamsRunner.class)
public class DoubleToStringTest {
    PrimitiveToStringAndBack primitiveToStringAndBack;

    @Before
    public void setUp(){ primitiveToStringAndBack = new PrimitiveToStringAndBack();
    }

    @FileParameters(RESOURCES_PATH + "primetive2string/double.txt")

    @Test
    public void doubleToStringTest(String expResult, double a) {
        Assert.assertEquals(expResult, PrimitiveToStringAndBack.doubleToString(a));
    }
}
