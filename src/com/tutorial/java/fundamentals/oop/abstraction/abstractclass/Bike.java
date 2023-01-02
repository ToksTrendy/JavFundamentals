package com.tutorial.java.fundamentals.oop.abstraction.abstractclass;

public class Bike extends Vehicle{
    @Override
    void applyBreak(int breakPoint) {
        speed -= (breakPoint/2);
    }
}
