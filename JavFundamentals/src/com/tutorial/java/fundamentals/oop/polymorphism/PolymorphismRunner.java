package com.tutorial.java.fundamentals.oop.polymorphism;

/**
 * Polymorphism is of two types
 *          i. Compile time polymorphism
 *          ii. Runtime polymorphism
 *
 *  Compile time polymorphism is method overloading
 *  Runtime polymorphism involves method overriding
 *  Polymorphism is oop concept that describes the ability of an object to take different form
 *
 */
public class PolymorphismRunner {

    public static void main(String[] args) {
        Dog dog = new Dog();
        System.out.println(dog.makeSound());
        System.out.println(dog.walk());
        System.out.println(dog.create().changeCollar());
        System.out.println("===================");

        Cat cat = new Cat();
        System.out.println(cat.makeSound());
        System.out.println(cat.walk());
        System.out.println("===================");

        HeGoat heGoat = new HeGoat();
        System.out.println(heGoat.makeSound());
        System.out.println(heGoat.walk());
        System.out.println(heGoat.mate());
        System.out.println("===================");

        SheGoat sheGoat = new SheGoat();
        System.out.println(sheGoat.makeSound());
        System.out.println(sheGoat.walk());
        System.out.println(sheGoat.mate());
        System.out.println("===================");

        Utils.makeSound(dog);
        Utils.makeSound(cat);
        Utils.makeSound(heGoat);

    }
}
