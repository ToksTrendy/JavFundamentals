package com.tutorial.java.fundamentals.classexample;

public class User {
    private String firstName;  //package available
    private String lastName;
    private int age ;

    private static String address = "Oloje Estate";

    private static final int numberOfLives = 3; //This is a constant

    public int getNumberOfLives(){
        return numberOfLives;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static String getAddress() {
        return address;
    }

    public static void setAddress(String address) {
        User.address = address;
    }

    public User() {
        this.firstName = "Dele";
        this.lastName = "Muhammad";
    }
    User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public User(String firstName) {
        this.firstName = firstName;
    }

    User(String name, boolean isLastName){
        if(isLastName){
            this.lastName = name;
        }else {
            this.firstName = name;
        }
    }

    public User(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public User(String firstName, int age) {
        this.firstName = firstName;
        this.age = age;
    }


    public User(int age) {
        this.age = age;
        setAddress("Olobedu");
    }

    public User(String name, int age, boolean isLastName) {
        if (isLastName){
            this.lastName = name;
        }else {
            this.firstName = name;
        }
        this.age = age;
    }

    public String displayUser(){
        return  "firstname : " + firstName
                + " lastname : " + lastName;
    }

    public  String getUserFullName() {
        return firstName + " " + lastName ;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", fullName='" + getUserFullName() + '\'' +
                ", address='" + getAddress() + '\'' +
                '}';
    }
}
