package com.kateromaniv.app.classwork.lesson9;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static com.kateromaniv.app.utils.Consts.RESOURCES_PATH;

/*Created by katr on 27.04.2017.
 */

@RunWith(JUnitParamsRunner.class)

public class IntToStringTest {
    PrimitiveToStringAndBack primitiveToStringAndBack;

    @Before
    public void setUp(){ primitiveToStringAndBack = new PrimitiveToStringAndBack();
    }

    @FileParameters(RESOURCES_PATH + "primetive2string/int.txt")

    @Test
    public void intToStringTest(String expResult, int a) {
        Assert.assertEquals(expResult, PrimitiveToStringAndBack.intToString(a));
    }
}
