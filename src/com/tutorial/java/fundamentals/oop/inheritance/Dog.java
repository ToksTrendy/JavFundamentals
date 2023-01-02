package com.tutorial.java.fundamentals.oop.inheritance;

public class Dog extends Animal{
    private boolean hasCollar;

    public boolean isHasCollar() {
        return hasCollar;
    }

    public void setHasCollar(boolean hasCollar) {
        this.hasCollar = hasCollar;
    }

    public Dog(String name, int age, boolean hasCollar) {
        super(name, age);
        this.hasCollar = hasCollar;
    }

    public void hunt() {
        System.out.println("I am a dog and I am hunting");
    }
}
