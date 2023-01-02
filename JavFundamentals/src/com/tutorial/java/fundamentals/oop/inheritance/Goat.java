package com.tutorial.java.fundamentals.oop.inheritance;

public class Goat extends Animal{
    private String gender = "Male";

    public String getGender() {
        return gender;
    }

    public void setGender(String sex) {
        this.gender = sex;
    }

    public Goat(String name, int age, String gender) {
        super(name, age);
        this.gender = gender;
    }

    @Override  //Method override from Animal class
    public int getAge() {
        return super.getAge() + 2;
    }

    @Override //Method override from Animal class
    public void display() {
        System.out.println("I am a goat, my name is " + getName() + ", my age is " + getAge() + ", gender is " + getGender());
    }

    public void makeSound() {
        System.out.println("Meeeeeeeee");
    }
    /**
     * Method overload : is when a multiple methods have the same name but different arguments
     */
    public void makeSound(String gender) { //method overload
        if ("male".equals(gender)) {
            System.out.println("Mooooooooo");
        }else {
            System.out.println("Meeeeeeeee");
        }
    }

    public void makeSound(int age) { //method overload
        if (age < 2) {
            System.out.println("miiiin");
        }else {
            System.out.println("Meeeeeeeee");
        }
    }
}
