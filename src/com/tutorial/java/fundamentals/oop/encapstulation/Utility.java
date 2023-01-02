package com.tutorial.java.fundamentals.oop.encapstulation;

public class Utility {
    //method overloading
    public static void display(Person person) {
        StringBuilder sb = new StringBuilder();
        sb.append("Firstname : ")
                .append(person.getFirstName())
                .append(" LastName : ")
                .append(person.getLastName())
                .append(" Age : ")
                .append(person.getAge());
        System.out.println(sb);
    }

    public static void display(Staff staff) {
        StringBuilder sb = new StringBuilder();
        sb.append("Firstname : ")
                .append(staff.getFirstName())
                .append("LastName : ")
                .append(staff.getLastName())
                .append("Age : ")
                .append(staff.getAge())
                .append("Staff ID : ")
                .append(staff.getStaffId())
                .append("Department : ")
                .append(staff.getDepartment());
        System.out.println(sb);
    }
}
