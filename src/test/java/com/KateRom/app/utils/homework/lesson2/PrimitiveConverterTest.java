package com.KateRom.app.utils.homework.lesson2;

import org.junit.Assert;
import org.junit.Test;

public class PrimitiveConverterTest {
    @Test
    public void floatToCharTest () {
        float aFloat = 99.2f;
        char expResult = 'c';
        PrimitiveConverter converter1 = new PrimitiveConverter();
        converter1.floatToChar(aFloat);
        Assert.assertArrayEquals(new char[]{expResult}, new char[]{converter1.floatToChar(aFloat)});
    }
    @Test
    public void intToCharTest () {
        int anInt = 100;
        char expResult = 'd';
        PrimitiveConverter converter1 = new PrimitiveConverter();
        converter1.intToChar(anInt);
        Assert.assertArrayEquals(new char[]{expResult}, new char[]{converter1.intToChar(anInt)});
    }
    @Test
    public void charToIntTest () {
        char aChar = 'A';
        int expResult = 65;
        PrimitiveConverter converter1 = new PrimitiveConverter();
        converter1.charToInt(aChar);
        Assert.assertArrayEquals(new int[]{expResult}, new int[]{converter1.charToInt(aChar)});
    }

}
