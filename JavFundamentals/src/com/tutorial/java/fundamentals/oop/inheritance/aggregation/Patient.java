package com.tutorial.java.fundamentals.oop.inheritance.aggregation;

public class Patient {
    private int id;
    private String address;
    private boolean isNewPatient = true;

    private Profile profile; //has a relationship

    public Patient(int id, String address, Profile profile) {
        this.id = id;
        this.address = address;
        this.profile = profile;
    }

    Patient changeStatus() {
        if (isNewPatient) {
            isNewPatient = false;
        }
        return this;
    }

    public void printPatientDetails() {
        String status = "new";
        if (!isNewPatient) {
            status = "old";
        }

        profile.printProfileDetails();
        System.out.println(
                        "Id: " + id + " " +
                        "Address: " + address + " "  +
                        "Patient is " + status + " patient");
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", address='" + address + '\'' +
                ", isNewPatient=" + isNewPatient +
                '}';
    }
}
