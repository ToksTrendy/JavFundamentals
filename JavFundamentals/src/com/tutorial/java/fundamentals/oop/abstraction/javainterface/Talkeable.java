package com.tutorial.java.fundamentals.oop.abstraction.javainterface;

public interface Talkeable {
    void talk();

    static void shout(){
        System.out.println("Just shouting...");
    }
}
