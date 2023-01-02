package com.tutorial.java.fundamentals.oop.inheritance;

public class MethodOverriding {
    public static void main(String[] args) {
        Goat lanke = new Goat("Lanke", 3, "Male");
        lanke.display();
        lanke.makeSound();
        lanke.makeSound("male");
        lanke.makeSound(1);
    }
}
