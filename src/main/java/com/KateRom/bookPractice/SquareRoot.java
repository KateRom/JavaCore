package com.KateRom.bookPractice;

public class SquareRoot {

    public static void main(String[] args) {
        double a = 3;
        double b = 2.5;
        double c = -0.5;

        double d = b*b-4*a*c;

        double x1 = ((-b+Math.sqrt(d))/2*a);
        double x2 = ((-b-Math.sqrt(d))/2*a);

            System.out.println("x1 = " + x1 + "\n" + "x2 = " + x2);
    }
}

