package com.tutorial.java.fundamentals.oop.abstraction.javainterface;
/**
 * Interface: meant for multiple inheritance
 * It is used to ensure loose coupling
 * variables in interface are final, public, static
 * Interface is different from class with the following reasons
 * interface you cannot instantiate a variable and create an object unlike class that you can
 * interface does not contain concrete methods(is without body) but class can contain a concrete method
 * In interface you can only use public access identifier but in class you can use public, private, protected and default
 */
public interface  Flyable {
    public static final double heightRatio = 0.5;

    void fly();

    double getHeight();

    default String sayHello() {
       return "Hello ooo";
    }
}
