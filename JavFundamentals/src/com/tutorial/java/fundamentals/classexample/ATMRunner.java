package com.tutorial.java.fundamentals.classexample;

import java.util.*;

public class ATMRunner {
    public static void main(String[] args) {
        ATMMachine atm = new ATMMachine();

        User user = new User();
        System.out.println(user.getFirstName());
        System.out.println(user.getLastName());
        System.out.println(user.getAge());

        user.setFirstName("Khadijah");
        user.setLastName("Moronkola");

        System.out.println(user.getFirstName());
        System.out.println(user.getLastName());
        System.out.println(user.getAge());
        User adeOlaUser = new User("Ade", "ola");
        User sewa = new User("Sewa");
        User sewaAsLastName = new User("Sewa", true);
        User ola11 = new User("Ola", 11);
        User ola11LastName = new User("Ola", 11, true);
        User ten = new User(10);
        User.setAddress("Igbona");


        System.out.println(user);
        System.out.println(adeOlaUser);
        System.out.println(sewa);
        System.out.println(sewaAsLastName);
        System.out.println(ola11);
        System.out.println(ten);
        System.out.println(ola11LastName);
        System.out.println(ten.getNumberOfLives());
        System.out.println(ola11.getNumberOfLives());

        Scanner scanner = new Scanner(System.in);

    }
}
