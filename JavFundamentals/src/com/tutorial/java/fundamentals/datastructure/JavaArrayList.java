package com.tutorial.java.fundamentals.datastructure;

import com.tutorial.java.fundamentals.oop.inheritance.aggregation.Doctor;
import com.tutorial.java.fundamentals.oop.inheritance.aggregation.Profile;

import java.util.ArrayList;
import java.util.Arrays;

public class JavaArrayList {

    public static void main(String[] args) {
        ArrayList<Doctor> doctorList = new ArrayList<>();
        doctorList.add(new Doctor(1, "Surgery",
                new Profile("Ade", "Ola", "adex", "Ade34242**")));
        doctorList.add(new Doctor(2, "Medicine",
                new Profile("Alex", "James", "alexj", "Ade34242**")));
        Doctor[] doctorsArray = doctorList.toArray(new Doctor[0]);
        System.out.println(Arrays.toString(doctorsArray));

        System.out.println(doctorList);

        System.out.println(doctorList.get(0));
        System.out.println(doctorList.get(1));

        System.out.println(doctorList.isEmpty());

        ArrayList<Doctor> clone = (ArrayList<Doctor>) doctorList.clone();
        System.out.println(clone);

        System.out.println(clone.contains(doctorList.get(0)));

        doctorList.forEach(doctor -> {
            System.out.println("\nThis is doctor ==> " + doctor);
            doctor.printDoctorDetails();
        });
        System.out.println();

        doctorList.remove(0);
        System.out.println(doctorList);

        doctorList.clear();
        System.out.println(doctorList);
    }
}
