package com.tutorial.java.fundamentals.oop.inheritance;

public class Cat extends Animal{
    private boolean hasOwner;


    public boolean isHasOwner() {
        return hasOwner;
    }

    public void setHasOwner(boolean hasOwner) {
        this.hasOwner = hasOwner;
    }

    public Cat(String name, int age, boolean hasOwner) {
        super(name, age);
        this.hasOwner = hasOwner;
    }

    public Cat(boolean hasOwner) {
        this.hasOwner = hasOwner;
    }

    public Cat() {
    }
}
