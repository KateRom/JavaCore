package com.kateromaniv.runners.classwork.lesson10;

/*Created by katr on 11.05.2017.
 */
public class StringPerformanceRunner {
    public static void main(String argz[]){
    long start = System.currentTimeMillis();
    String c = "start";
    String b = "finish";
    for(long i = 0; i<1000000L; i++)
        c = c.concat(b);
    long end = System.currentTimeMillis();
        System.out.println(end-start);
    }

}
