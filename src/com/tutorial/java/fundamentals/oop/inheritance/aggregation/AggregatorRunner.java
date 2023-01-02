package com.tutorial.java.fundamentals.oop.inheritance.aggregation;

public class AggregatorRunner {

    public static void main(String[] args) {
        Profile patientProfile = new Profile("Ade", "Ola", "ademix", "1234");
        Patient patientFromOloje = new Patient(1, "Oloje", patientProfile);

        Profile doctorProfile = new Profile("Smith", "Anderson", "smithy", "1234");
        Doctor doctor = new Doctor(2, "Physiotherapy", doctorProfile);

        patientFromOloje.changeStatus().printPatientDetails();
        doctor.printDoctorDetails();
    }
}
