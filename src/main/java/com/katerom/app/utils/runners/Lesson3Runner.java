package com.KateRom.app.utils.runners;

import com.KateRom.app.utils.convertors.PrimitiveConvertor;

public class Lesson3Runner {
    float aFloat = 7.2f;
    int anInt = 8;
    char aChar = 'C';

        public static void main (String args[]) {
            PrimitiveConvertor convert1 = new PrimitiveConvertor();
            convert1.floatToChar();

            PrimitiveConvertor convert2 = new PrimitiveConvertor();
            convert2.intToChar();

        PrimitiveConvertor convert3  = new PrimitiveConvertor();
        convert3.charToInt();
        }
}
