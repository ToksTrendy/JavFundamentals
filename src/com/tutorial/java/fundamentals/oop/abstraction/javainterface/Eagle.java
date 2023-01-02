package com.tutorial.java.fundamentals.oop.abstraction.javainterface;

public class Eagle extends Bird implements Flyable, Talkeable{
    private static int flyingPotential = 200;
    @Override
    public void fly() {
        System.out.println("I am eagle: " +getName() + ", I am flying " + getHeight() + "meters above sea level");
    }

    @Override
    public double getHeight() {
        return flyingPotential * heightRatio;
    }

    @Override
    public String sayHello() {
        return "Hello from Eagle";
    }

    @Override
    public void talk() {
        System.out.println("Croow crooow");
    }
}
