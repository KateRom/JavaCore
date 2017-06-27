package com.kateromaniv.app.homework.lesson14;

/*Created by katr on 21.06.2017.
 */
public abstract class Bicycle {

    public void ride(){
        System.out.println("Wroom");
    }

    public abstract void setSpeed(int speed);
    public abstract void setGear(int gear);
}
