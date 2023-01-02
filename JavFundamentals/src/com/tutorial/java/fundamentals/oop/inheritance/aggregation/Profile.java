package com.tutorial.java.fundamentals.oop.inheritance.aggregation;

public class Profile {
    private String firstName;
    private String lastName;
    private String username;
    private String password;

    public Profile(String firstName, String lastName, String username, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUsername() {
        return username;
    }

    public void printProfileDetails() {
        System.out.print(
        "FirstName: " + getFirstName() + " " +
                "LastName: " + getLastName() + " " +
                "UserName: " + getUsername() + " " );
    }

    @Override
    public String toString() {
        return "Profile{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
