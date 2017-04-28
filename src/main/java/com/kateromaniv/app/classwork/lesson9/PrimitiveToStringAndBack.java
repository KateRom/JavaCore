package com.kateromaniv.app.classwork.lesson9;

/*Created by katr on 25.04.2017.
 */
public class PrimitiveToStringAndBack {
    public static String intToString(int a){
        return String.valueOf(a);
    }
    public static String doubleToString(double b){
        return String.valueOf(b);
    }

    public static String longToString(long b){
        return String.valueOf(b);
    }

    public static String booleanToString(boolean b){
        return String.valueOf(b);
    }
    public static int stringToInt (String a) {
        return Integer.valueOf(a);
    }

    public static double stringToDouble (String a) {
        return Double.valueOf(a);
    }

    public static long stringToLong (String a) {
        return Long.valueOf(a);
    }
    public static boolean stringToBoolean (String y) {
        return Boolean.valueOf(y);
    }
}
