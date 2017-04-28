package com.kateromaniv.app.homework.lesson6;

import com.kateromaniv.app.homework.lesson4.BiggerNumber;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import static com.kateromaniv.app.utils.Consts.RESOURCES_PATH;

@RunWith(JUnitParamsRunner.class)
public class BiggerNumberParamsTest {
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
