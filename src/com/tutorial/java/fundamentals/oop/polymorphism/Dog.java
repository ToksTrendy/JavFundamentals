package com.tutorial.java.fundamentals.oop.polymorphism;

public class Dog extends Animal{

    private boolean hasCollar;

    public Dog create() {
        return this;
    }

    public Dog changeCollar() {
        if(hasCollar) {
            this.hasCollar = false;
        } else {
            this.hasCollar = true;
        }
        return this;
    }

    @Override
    protected String makeSound() {
        return "Dog sound : bark bark";
    }

    @Override
    String walk() {
        if (hasCollar) {
            return "Walking with collar";
        }
        return "Walking alone";
    }

    @Override
    public String toString() {
        return "Dog{" +
                "hasCollar=" + hasCollar +
                '}';
    }
}
