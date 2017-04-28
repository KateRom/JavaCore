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
public class BooleanToStringTest {
    PrimitiveToStringAndBack primitiveToStringAndBack;

    @Before
    public void setUp(){ primitiveToStringAndBack = new PrimitiveToStringAndBack();
    }

    @FileParameters(RESOURCES_PATH + "primetive2string/boolean.txt")
    @Test
    public void booleanToStringTest(String expResult, boolean a) {
        Assert.assertEquals(expResult, PrimitiveToStringAndBack.booleanToString(a));
    }
}
