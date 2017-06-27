package com.kateromaniv.runners.homework.lesson12;

import com.kateromaniv.app.homework.lesson12.Human;

/*Created by katr on 21.06.2017.
 */
public class HumanRunner {
    public static void main(String[] args) {
        Human h = new Human(23, "Stefan");
        System.out.println(h.getName() + " is " + h.getAge());
    }
}
