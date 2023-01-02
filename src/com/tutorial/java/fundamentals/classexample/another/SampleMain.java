package com.tutorial.java.fundamentals.classexample.another;

import com.tutorial.java.fundamentals.classexample.User;

public class SampleMain {
    public static void main(String[] args) {
        User user = new User(35);
        String userFullName = user.getUserFullName();
        System.out.println(user);
        System.out.println(userFullName);
    }
}
