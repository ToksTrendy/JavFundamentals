package com.tutorial.java.fundamentals.oop.encapstulation;


/**
 * Access modifiers: private, public, protected and default
 * Private means only accessible within a class, ie. cannot be used outside of the class
 * protected: only accessible within a package, as well as sub-classes in other packages
 * default: accessible from within a package, it has no keyword
 * public: can be accessed anywhere within a running program
 * Access modifiers can be used on properties, methods and classes
 */
public class Person {

    //pojo = play old java object
    private String firstName;
    private String lastName;
    int age;
    private String address;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    protected void setAddress(String address) {
        this.address = address;
    }

    protected String getAddress() {
        return address;
    }

    public void display() {
        System.out.println(
                "Firstname : " + firstName + ", " +
                "LastName : " + lastName + ", " +
                "Age : " + age + ", "
        );
    }
}
