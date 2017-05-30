package com.kateromaniv.runners.classwork.lesson13;

/* Created by katr on 30.05.2017.
 */
public class Bicycle {
    private int wheelSize;
    private String color = "red";
    private double speed;
    private boolean unUsed;

    public Bicycle(int wheelSize, String color){
        this.color = color;
        this.wheelSize = wheelSize;
    }

    public Bicycle(int wheelSize){
        this();
        this.wheelSize = wheelSize;
    }

    public Bicycle (double speed, int wheelSize, boolean unUsed){
        this(wheelSize);
        this.speed = speed;
        this.unUsed = unUsed;
    }

    public Bicycle(){
        this.wheelSize = 26;
        this.color = "red";
        this.speed = 99.9;
        this.unUsed = true;
        }

    public String ride(){ // method
        return "Wroom!";
        }
    }

