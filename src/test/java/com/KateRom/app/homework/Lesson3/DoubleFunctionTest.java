package com.KateRom.app.homework.Lesson3;

import org.junit.Assert;
import org.junit.Test;

import java.util.Date;
import java.util.Locale;
import java.util.Stack;

public class DoubleFunctionTest {
    @Test
    public void doubleEqualsTest () {
        double obj1 = 10.0;
        double obj2 = 10;
        boolean expResult = true;
        Assert.assertArrayEquals(new boolean[]{expResult}, new boolean[]{DoubleFunction.doubleEquals(obj1, obj2)});
    }
    @Test
    public void doubleEqualsNegatveTest () {
        double obj1 = 10.0;
        double obj2 = 11;
        boolean expResult = false;
        Assert.assertArrayEquals(new boolean[]{expResult}, new boolean[]{DoubleFunction.doubleEquals(obj1, obj2)});
    }
    @Test
    public void convertToStringTest (){
        Date date = new Date(07, 01, 12);
        String expResult = "Tue Feb 12 00:00:00 EET 1907";
        Assert.assertEquals(expResult, DoubleFunction.convertToString(date));
    }
    @Test
    public void idCountryTest (){
        Locale locale = new Locale("UKRAINIAN", "Ukr");
        String expResult = "UKR";
        Assert.assertEquals(expResult, DoubleFunction.idCountry(locale));
    }
    @Test
    public void myStackTest () {
        Stack stack = new Stack();
        boolean expResult = true;
        Assert.assertArrayEquals(new boolean[]{expResult}, new boolean[]{DoubleFunction.myStack(stack)});
    }
    @Test
    public void myStackTest2 () {
        Stack stack = new Stack();
        stack.push("code");
        boolean expResult = false;
        Assert.assertArrayEquals(new boolean[]{expResult}, new boolean[]{DoubleFunction.myStack(stack)});
    }
}

