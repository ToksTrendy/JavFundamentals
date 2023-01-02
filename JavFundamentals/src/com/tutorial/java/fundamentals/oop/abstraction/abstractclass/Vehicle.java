package com.tutorial.java.fundamentals.oop.abstraction.abstractclass;

public abstract class Vehicle {
    int speed;
    abstract void applyBreak(int breakPoint);
    void accelerate(int increment) {
        speed += increment;
    }

    String displayMessage () {
        return "Speed " + speed;
    }
}
