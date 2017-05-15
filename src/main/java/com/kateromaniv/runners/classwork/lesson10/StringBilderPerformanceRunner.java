package com.kateromaniv.runners.classwork.lesson10;

/*Created by katr on 11.05.2017.
 */
public class StringBilderPerformanceRunner {
    public static void main(String argz[]){
        long start = System.currentTimeMillis();
        StringBuilder c = new StringBuilder("start");
        String b = "finish";
        for(long i = 0; i<1000000L; i++)
            c = c.append(b);
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
}
