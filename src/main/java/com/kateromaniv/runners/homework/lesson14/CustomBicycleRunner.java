package com.kateromaniv.runners.homework.lesson14;

import com.kateromaniv.app.homework.lesson14.Bicycle;
import com.kateromaniv.app.homework.lesson14.CustomBicycle;

/*Created by katr on 21.06.2017.
 */
public class CustomBicycleRunner {
    public static void main(String[] args) {customBicycleMenu();}
    public static void customBicycleMenu(){
        Bicycle b = new CustomBicycle();
        b.ride();
    }
}
