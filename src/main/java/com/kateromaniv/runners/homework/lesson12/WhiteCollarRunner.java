package com.kateromaniv.runners.homework.lesson12;

import com.kateromaniv.app.homework.lesson12.WhiteCollar;

/*Created by katr on 21.06.2017.
 */
public class WhiteCollarRunner {
    public static void main(String[] args) {
        WhiteCollar wC = new WhiteCollar(25, "Kate", "Ciklum");
        System.out.println(wC.getName() + " is " + wC.getAge() + " and works at " + wC.getcName());
    }
}
