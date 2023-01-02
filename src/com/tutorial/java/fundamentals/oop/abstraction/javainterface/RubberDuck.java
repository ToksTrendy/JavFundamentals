package com.tutorial.java.fundamentals.oop.abstraction.javainterface;

public class RubberDuck extends Bird implements Talkeable{

    @Override
    public void talk() {
        System.out.println("chiiiing chiiiiing");
    }
}
