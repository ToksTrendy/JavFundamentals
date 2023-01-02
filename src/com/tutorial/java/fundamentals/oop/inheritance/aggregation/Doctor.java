package com.tutorial.java.fundamentals.oop.inheritance.aggregation;

public class Doctor{
    private int id;
    private String department;
    private Profile profile; //has a relationship

    public Doctor(int id, String department, Profile profile) {
        this.id = id;
        this.department = department;
        this.profile = profile;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "id=" + id +
                ", department='" + department + '\'' +
                ", profile=" + profile +
                '}';
    }

    public void printDoctorDetails() {
        profile.printProfileDetails();
        System.out.print(
                "Id: " + id + " " +
                "Department: " + department);
    }
}
