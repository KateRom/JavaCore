package com.KateRom.app.homework.lesson5;

import com.KateRom.app.classwork.lesson4.CalculateTriangle;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class CalculateTriangleParamsTest {
    CalculateTriangle calculateTriangle;

    @Before
    public void setUp(){
        calculateTriangle = new CalculateTriangle();
    }

    @Test

    @Parameters(method = "rightAngled")
    public void isItRightAngledTest(double a, double b, double c,boolean isTrue) {
        Assert.assertArrayEquals(new boolean[] {CalculateTriangle.isITRightAngled(a, b, c)}, new boolean[]{isTrue});
    }

    private Object[] rightAngled() {
        return new Object[] {
                new Object[] {3,4,5,true},
                new Object[] {1,2,3,false},
                new Object[] {0,2,3,false},
                new Object[] {3.8,4.6,10.7,false},
                new Object[] {0,0,0,false},
                new Object[] {-3,-4,-5,false},
                new Object[] {'a','b','c',false},

        };
    }
}
