package com.tutorial.java.fundamentals.oop.abstraction.abstractclass;
/**
 * Abstract class: is any class that has abstract keyword in its declaration
 *                 it contains abstract method(s), but can also contain non-abstract method
 *                 to create abstract method you add abstract keyword to its declaration
 *                 it's instance cannot be created
 *                 constructors cannot be added to it
 *                 Abstract class may or may not have an abstract method
 *                 it can have static methods
 *                 we can declare final methods in abstract class, but final method cannot be abstract
 *                 Abstract class can inherit from another abstract class
 *
 */
public class AbstractClassRunner {
    public static void main(String[] args) {
        Bike bike = new Bike();
        bike.accelerate(20);
        bike.applyBreak(20);
        System.out.println(bike.displayMessage());

        Car car = new Car();
        car.accelerate(100);
        car.applyBreak(80);
        System.out.println(car.displayMessage());

        Tanker tanker = new Tanker(1800);
        tanker.accelerate(50);
        tanker.applyBreak(30);
        tanker.toggleFloodLight();
        System.out.println(tanker.displayMessage());
    }
}
