package com.KateRom.app.homework.lesson5;

import com.KateRom.app.homework.lesson4.BiggerNumber;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class BiggerNumberParamsTest {
    private  final static String RESOURCES_PATH = "src/test/java/resources/";
    BiggerNumber biggerNumber;

    public void seyUp() {
        biggerNumber = new BiggerNumber();
    }

    @FileParameters(RESOURCES_PATH + "bigger_number_params.txt")

    @Test
    public void whatNumberBiggerTest (double a, double b, double expResult) {
        Assert.assertEquals(expResult, BiggerNumber.whatNumberBigger(a, b), 0);
    }
}
