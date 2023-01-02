package com.tutorial.java.fundamentals.oop;

/**
 * Abstraction: identifying only the required characteristics of an object.

 * Consider a real-life example of a man driving a car:
 * The man only knows that pressing the accelerators will increase the car speed or applying brakes will stop the car,
 * but he does not know how on pressing the accelerator,
 * the speed is actually increasing. He does not know about the inner mechanism of the car
 * or the implementation of the accelerators, brakes etc. in the car. This is what abstraction is.

 * In Java, abstraction is achieved by interfaces and abstract classes.
 * We can achieve 100% abstraction using interfaces.

 * Abstract classes and Abstract methods :
 * An abstract class is a class that is declared with an abstract keyword.
 * An abstract method is a method that is declared without implementation.
 * An abstract class may or may not have all abstract methods. Some of them can be concrete methods
 * A method-defined abstract must always be redefined in the subclass, thus making overriding compulsory or making the subclass itself abstract.
 * Any class that contains one or more abstract methods must also be declared with an abstract keyword.
 * There can be no object of an abstract class. That is, an abstract class can not be directly instantiated with the new operator.
 * An abstract class can have parameterized constructors and the default constructor is always present in an abstract class.
 */

public class Abstraction {
}
