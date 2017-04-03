package com.KateRom.app.homework.lesson6;

import com.KateRom.app.homework.lesson4.CalculateBiggerArea;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)

public class CalculateBiggerAreaParamsTest {
    private static final String RESOURCES_PATH = "src/test/java/resources/";
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
