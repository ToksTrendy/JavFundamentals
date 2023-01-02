package com.tutorial.java.fundamentals.oop.abstraction.javainterface;

public class Fowl extends Bird implements Flyable, Talkeable{
    private static int flyingPotential = 2;
    @Override
    public void fly() {
        System.out.println("I am fowl: " +getName() + ", I am flying " + getHeight() + "meters above sea level");
    }

    @Override
    public double getHeight() {
        return flyingPotential * heightRatio;
    }

    @Override
    public void talk() {
        System.out.println("Kiii kiiii");
    }
}
