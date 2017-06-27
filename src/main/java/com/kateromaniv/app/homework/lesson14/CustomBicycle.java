package com.kateromaniv.app.homework.lesson14;

/*Created by katr on 21.06.2017.
 */
public class CustomBicycle extends Bicycle{
    private int speed;
    private int gear;

    public int getSpeed() {
        return speed;
    }

    public int getGear() {
        return gear;
    }

    @Override
    public void ride(){
        System.out.println("Wshhhh!");
    }


    @Override
    public void setSpeed(int speed) {
        this.speed = speed;
        System.out.println(speed);
    }

    @Override
    public void setGear(int gear) {
        this.gear = gear;
        System.out.println(gear);
    }

}
