package com.KateRom.app.homework.lesson6;


import com.KateRom.app.homework.lesson3.DoubleFunction;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)

public class DoubleFunctionParamsTest {
    private static final String RESOURCES_PATH = "src/test/java/resources/";
    DoubleFunction doubleFunction;

    @Before
    public void setUp(){doubleFunction = new DoubleFunction();}

    @FileParameters(RESOURCES_PATH + "double_function_params.txt")

    @Test
    public void doubleEqualsTest (double obj1, double obj2, boolean expResult) {
        Assert.assertArrayEquals(new boolean[]{expResult}, new boolean[]{DoubleFunction.doubleEquals(obj1, obj2)});
    }
}
