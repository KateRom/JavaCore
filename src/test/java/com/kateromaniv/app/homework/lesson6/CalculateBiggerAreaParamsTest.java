package com.kateromaniv.app.homework.lesson6;

import com.kateromaniv.app.homework.lesson4.CalculateBiggerArea;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static com.kateromaniv.app.utils.Consts.RESOURCES_PATH;

@RunWith(JUnitParamsRunner.class)

public class CalculateBiggerAreaParamsTest {

    CalculateBiggerArea calculateBiggerArea;

    @Before
    public void setUp() {
        calculateBiggerArea = new CalculateBiggerArea();
    }

    @FileParameters (RESOURCES_PATH + "calculate_bigger_area_params.txt")

    @Test
    public void calculateBiggerAreaTest (double radius1, double radius2, double expResult) {
        Assert.assertEquals(expResult, CalculateBiggerArea.calculateBiggerArea(radius1, radius2), 0.1);
    }
}
