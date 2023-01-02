package com.tutorial.java.fundamentals.oop.encapstulation;

public class Staff extends Person {
    private String staffId;
    private String department;

    public Staff(String firstName, String lastName, int age) {
        super(firstName, lastName, age);
    }

    public Staff(String firstName, String lastName, int age, String staffId, String department) {
        super(firstName, lastName, age);
        this.staffId = staffId;
        this.department = department;
    }

    public Staff(Person person, String staffId, String department) {
        super(person.getFirstName(), person.getLastName(), person.getAge());
        this.staffId = staffId;
        this.department = department;
    }

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "staffId='" + staffId + '\'' +
                ", department='" + department + '\'' +
                ", age ='" + super.age + '\'' +
                ", address ='" + super.getAddress() + '\'' +
                '}';
    }

    @Override
    public void display() {
        System.out.println(
                "Firstname : " + super.getFirstName() + ", " +
                        "LastName : " + super.getLastName() + ", " +
                        "Age : " + age + ", " +
                        "Staff : " + staffId + ", " +
                        "Department : " + department
        );
    }
}