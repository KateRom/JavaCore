package com.kateromaniv.runners.homework.lesson14;


import com.kateromaniv.app.homework.lesson14.BicycleWithRing;
import com.kateromaniv.app.homework.lesson14.BicycleWithRingInterface;

/*Created by katr on 21.06.2017.
 */
public class BicycleWithRingRunner {
    public static void main(String[] args) {bicycleWithRingMenu();}
    public static void bicycleWithRingMenu(){
        BicycleWithRingInterface b = new BicycleWithRing();
        b.ring();
    }
}
