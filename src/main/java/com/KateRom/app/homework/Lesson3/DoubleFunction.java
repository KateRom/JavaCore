package com.KateRom.app.homework.Lesson3;

import java.util.*;

public class DoubleFunction {
    public static boolean doubleEquals (double obj1, double obj2){
        return Objects.equals(obj1, obj2);
    }
    public static String convertToString (Date date) {
        return date.toString();
    }
    public static String idCountry (Locale locale) {
        return locale.getCountry();
    }
    public static boolean myStack (Stack stack) {
        return stack.empty();
    }
}
