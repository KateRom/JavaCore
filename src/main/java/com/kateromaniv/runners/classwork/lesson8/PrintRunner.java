package com.kateromaniv.runners.classwork.lesson8;

/*Created by katr on 20.04.2017.
 */
public class PrintRunner {
    public static void main(String args[]){
        System.out.println("Before:" + "\\' single quote\n" +
                "\\\" double quote\n" +
                "\\\\ backslash\n" +
                "\\n new line\n" +
                "\\r carriage return\n" +
                "\\t tab\n" +
                "\\b backspace\n" +
                "\\f form feed\n" +
                "\\0 null character (U+0000 NULL) (only if the next character is not a decimal digit; else it is an octal escape sequence)");
        System.out.println("After:" + "\' single quote\n" +
                "\" double quote\n" +
                "\\ backslash\n" +
                "\n new line\n" +
                "\r carriage return\n" +
                "\t tab\n" +
                "\b backspace\n" +
                "\f form feed\n" +
                "\0 null");

    }
}
