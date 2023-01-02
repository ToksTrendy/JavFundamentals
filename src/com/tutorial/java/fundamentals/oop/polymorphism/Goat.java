package com.tutorial.java.fundamentals.oop.polymorphism;

public class Goat extends Animal{

    @Override
    String makeSound() {
        return "Goat sound: Mee mee";
    }

    @Override
    String walk() {
        return "Goat walk, looking for trouble";
    }

    String mate() {
        return "Goat mating";
    }
}
