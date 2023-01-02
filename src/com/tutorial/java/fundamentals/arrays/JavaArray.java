package com.tutorial.java.fundamentals.arrays;


import com.tutorial.java.fundamentals.classexample.User;

import java.util.Arrays;

public class JavaArray {

    //Array is an object in java that can contain elements of the same data types or objects
    //It is how java represent an in-memory list that it size cannot be changed
    //It is index based starting from zero(0), i.e. elements in the array can be added/retrieved by its index position
    // the first element of an array has an index of zero
    //Arrays are very fast way of storing related elements thn any other java way of doing so
    //It allows elements to easily retrieved or added (i.e. random access)
    //We have both single dimensional array and multi-dimensional arrays in java

    public static void main(String[] args) {

        //single dimensional array
        //declaration of an array data type
        int[] integerArray;
        long[] longArray;
        User[] userArray;


        ////somr codes
        //fetch values  of long array from database

        //initialization of an array
        integerArray = new int[10]; //if you know the size of the element beforehand / you can guess the max size
        longArray = new long[]{12, 23456, 23, 2}; //if you want to create the known elements at a later time from declaration point
        String[] stringArray = {"Apple", "Banana", "Orange"};
        userArray = new User[]{
                new User("Ade"),
                new User(),
                new User("Fatimoh", 2),
                new User()
        };

        User testUsers[] = new User[12];
        char chars[] = new char[12];
        byte bytes[] = new byte[12];


        User defaultUser = new User();
        User khadijah = new User("Khadijah");
        User[] anotherUserArray = {defaultUser, khadijah};

        //Arrays toString method
        System.out.println(Arrays.toString(integerArray));
        System.out.println(Arrays.toString(longArray));
        System.out.println(Arrays.toString(stringArray));
        System.out.println(Arrays.toString(userArray));
        System.out.println(Arrays.toString(anotherUserArray));
        System.out.println(Arrays.toString(testUsers));
        System.out.println(Arrays.toString(chars));
        System.out.println(Arrays.toString(bytes));

        //length property of Array
        System.out.println(integerArray.length);
        System.out.println(longArray.length);
        System.out.println(stringArray.length);
        System.out.println(userArray.length);
        System.out.println(anotherUserArray.length);
    }
}
