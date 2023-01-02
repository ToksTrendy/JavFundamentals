package com.tutorial.java.fundamentals.staticExample;

public class StaticExample {

    static String name;

    int age;

    public StaticExample(int age) {
        this.age = age;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        StaticExample.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    void changeName(String newName) {
        name = newName;
    }

    void display() {
        System.out.println("Name : " + name + ", Age : " + age);
    }
}
