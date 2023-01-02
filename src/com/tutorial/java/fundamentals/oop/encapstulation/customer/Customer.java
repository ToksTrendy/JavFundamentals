package com.tutorial.java.fundamentals.oop.encapstulation.customer;


import com.tutorial.java.fundamentals.oop.encapstulation.Person;

public class Customer extends Person {
    private String customerId;
    private String customerType;

    public Customer(String firstName, String lastName, int age, String customerId, String customerType) {
        super(firstName, lastName, age);
        this.customerId = customerId;
        this.customerType = customerType;
    }

    public Customer(String firstName, String lastName, int age, String customerType) {
        super(firstName, lastName, age);
        int number = (int) (Math.random() * 10) + 1;
        this.customerId = "Cus" + number;
        this.customerType = customerType;
    }

    public Customer(Person person) {
        super(person.getFirstName(), person.getLastName(), person.getAge());
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId='" + customerId + '\'' +
                ", customerType='" + customerType + '\'' +
                ", address='" + super.getAddress() + '\'' +
                '}';
    }
}
