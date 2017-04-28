package com.kateromaniv.runners.classwork.lesson9;

import com.kateromaniv.app.classwork.lesson9.PrimitiveToStringAndBack;

/*Created by katr on 25.04.2017.
 */
public class PrimitiveToStringAndBackRunner {
    public static void main(String args[]){
        int a = 3;
        double b = 3.3;
        long c = 9999L;
        boolean d =false;
        System.out.println(PrimitiveToStringAndBack.intToString(a));
        System.out.println(PrimitiveToStringAndBack.doubleToString(b));
        System.out.println(PrimitiveToStringAndBack.longToString(c));
        System.out.println(PrimitiveToStringAndBack.booleanToString(d));
        System.out.println(PrimitiveToStringAndBack.stringToInt(PrimitiveToStringAndBack.intToString(a)));
        System.out.println(PrimitiveToStringAndBack.stringToDouble(PrimitiveToStringAndBack.doubleToString(b)));
        System.out.println(PrimitiveToStringAndBack.stringToLong(PrimitiveToStringAndBack.longToString(c)));
        System.out.println(PrimitiveToStringAndBack.stringToBoolean(PrimitiveToStringAndBack.booleanToString(d)));
    }
}
