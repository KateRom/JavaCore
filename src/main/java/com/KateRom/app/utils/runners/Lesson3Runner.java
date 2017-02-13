package com.KateRom.app.utils.runners;

import com.KateRom.app.utils.convertors.PrimitiveConvertor;

public class Lesson3Runner {
        public static void main (String args[]) {
            PrimitiveConvertor convert1 = new PrimitiveConvertor();
            convert1.floatToChar();

            PrimitiveConvertor convert2 = new PrimitiveConvertor();
            convert2.intToChar();

            PrimitiveConvertor convert3  = new PrimitiveConvertor();
            convert3.charToInt();
        }
}
