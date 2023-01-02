package com.tutorial.java.fundamentals.oop.inheritance;

public class Animal {
    private String name;
    private int age;
    public Animal() {
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void display() {
        if (name == null && age == 0) {
            System.out.println("Animal name and age is not defined");
        } else {
            System.out.println("Animal name is : " + name + ",  age is : " + age);
        }
    }
}
