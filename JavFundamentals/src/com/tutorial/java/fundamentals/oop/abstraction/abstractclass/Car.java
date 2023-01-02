package com.tutorial.java.fundamentals.oop.abstraction.abstractclass;

public class Car extends Vehicle{
    @Override
    void applyBreak(int breakPoint) {
        speed -= breakPoint;
    }
}
