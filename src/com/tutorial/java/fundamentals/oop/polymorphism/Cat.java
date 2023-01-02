package com.tutorial.java.fundamentals.oop.polymorphism;

public class Cat extends Animal{

    Cat create() {
        return this;
    }

    @Override
    String makeSound() {
        return "Cat sound: Meow meow";
    }

    @Override
    String walk() {
        return "Walking, catching a rat";
    }

    @Override
    public String toString() {
        return "Cat{}";
    }
}
