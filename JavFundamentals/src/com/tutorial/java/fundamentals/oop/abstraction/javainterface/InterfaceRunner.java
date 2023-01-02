package com.tutorial.java.fundamentals.oop.abstraction.javainterface;

public class InterfaceRunner {

    public static void main(String[] args) {
        Eagle eagle = new Eagle();
        eagle.setName("Eagle");
        eagle.setColor("Golden");
        eagle.talk();
        eagle.fly();
        System.out.println(eagle.getColor() + " " + eagle.getName() + ", height is " + eagle.getHeight());
        System.out.println(eagle.sayHello());

        System.out.println("====================");

        Fowl fowl = new Fowl();
        fowl.setName("Fowl");
        fowl.setColor("White");
        fowl.talk();
        fowl.fly();
        System.out.println(fowl.getColor() + " " + fowl.getName() + ", height is " + fowl.getHeight());
        System.out.println(fowl.sayHello());
        System.out.println("====================");


        RubberDuck rubberDuck = new RubberDuck();
        rubberDuck.setName("Rubber~duck");
        rubberDuck.setColor("green");
        rubberDuck.talk();

        Talkeable.shout();

        talk(eagle);
        talk(fowl);
        talk(rubberDuck);
    }


    static void talk(Talkeable talkeable) {
        talkeable.talk();
    }
}
