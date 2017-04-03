package com.KateRom.app.homework.lesson6;

import com.KateRom.app.classwork.lesson4.OddNumber;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;


@RunWith(Parameterized.class)
public class OddNumberParamsTest {

    private Integer fInput;
    private  Boolean fExpected;
    private OddNumber oddNumber;

    @Before
    public void initialize() {
        oddNumber = new OddNumber();
    }
    public OddNumberParamsTest (Integer fInput, Boolean fExpected) {
        this.fInput = fInput;
        this.fExpected = fExpected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]>  params() {
        return Arrays.asList ( new Object[][] {
                {0, false},
                {1,true},
                {2, false},
                {11, true},
                {-3, true}
        });
    }

    @Test
    public void  test () {
        Assert.assertEquals(fExpected, OddNumber.isNumberOdd(fInput));
    }
}
