package com.tutorial.java.fundamentals.oop.inheritance;
/**
 * We make use of "extends" keyword
 * A class can only inherits(extends) a class. i.e. only one parent
 * java only has a single true inheritance
 * multiple inheritance is achieved with interface
 */
public class Inheritance {
    public static void main(String[] args) {
        Animal namelessAnimal = new Animal();
        namelessAnimal.display();

        System.out.println("================");

        Animal camel = new Animal("Camel", 20);
        camel.display();
        System.out.println("================");

        Dog jark = new Dog("Jark", 2, false);
        jark.display();
        jark.hunt();
        System.out.println("================");

        Cat namelessCat = new Cat();
        namelessCat.display();
        System.out.println("================");

        Cat sheCat = new Cat("SheCat", 1, true);
        sheCat.display();
        System.out.println("Has owner : " + sheCat.isHasOwner());
        System.out.println("================");
    }
}
