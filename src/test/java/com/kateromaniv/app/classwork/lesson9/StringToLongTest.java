package com.kateromaniv.app.classwork.lesson9;

/*Created by katr on 28.04.2017.
 */

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static com.kateromaniv.app.utils.Consts.RESOURCES_PATH;

@RunWith(JUnitParamsRunner.class)

public class StringToLongTest {
    PrimitiveToStringAndBack primitiveToStringAndBack;

    @Before
    public void setUp(){ primitiveToStringAndBack = new PrimitiveToStringAndBack();
    }

    @FileParameters(RESOURCES_PATH + "string2primitive/str2long.txt")

    @Test
    public void strToLongTest(long expResult, String a){
        Assert.assertEquals(expResult, PrimitiveToStringAndBack.stringToLong(a));
    }
}
