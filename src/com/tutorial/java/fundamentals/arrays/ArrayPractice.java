package com.tutorial.java.fundamentals.arrays;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayPractice {

    private static int MY_FAVOURITE_FRUITS_SIZE = 5;

    public static void main(String[] args) {
        String[] fruits = getArrayOfFruits();
        String[] favouriteFruits = getFavouriteFruits(fruits);

        printStringArrayWithForEach(fruits);
        printStringArrayWithForEach(favouriteFruits);
        printStringArrayWithForEachWithStringBuilder(favouriteFruits);

        Arrays.sort(fruits, 2, 5);
        printStringArrayWithForEach(fruits);

        Arrays.sort(fruits);
        printStringArrayWithForEach(fruits);

        Arrays.sort(fruits, Comparator.reverseOrder());
        printStringArrayWithForEach(fruits);

        Arrays.sort(fruits, Comparator.comparing(String::length));
        printStringArrayWithForEach(fruits);

        Arrays.sort(fruits);
        int banana = Arrays.binarySearch(fruits, "Water");
        System.out.println(banana);

        String[] strings = Arrays.copyOf(fruits, fruits.length * 2);
        printStringArrayWithForEach(strings);


        sumMultipleOf(2, 90, 100);
    }

    private static void sumMultipleOf(int multiple, int fromIndex, int toIndex) {
        int ans = 0;
        for (int i = fromIndex; i <= toIndex; i++) {
            if (i % multiple == 0) {
                ans += i;
            }
        }
        System.out.println(ans);
    }

    private static void printStringArrayWithForLoop(String[] stringArray) {
        //index for loop
        for (int i = 0; i < stringArray.length; i++) {
            System.out.println(stringArray[i]);
        }
        System.out.println("=================");
    }

    private static void printStringArrayWithArraysClass(String[] stringArray) {
        //print Array
        System.out.println(Arrays.toString(stringArray));
    }

    private static void printStringArrayWithForEach(String[] stringArray) {
        //for each loop
        String output = "";
        int counter = 0;
        for (String s : stringArray) {
            if (counter == 0) {
                output = output.concat("[");
            }
            if (s == null){
                s = "null";
            }
            output = output.concat(s);

            counter++;

            if (counter != stringArray.length){
                output = output.concat(", ");
            }else {
                output = output.concat("]");
            }
        }

        System.out.println(output);
    }

    private static void printStringArrayWithForEachWithStringBuilder(String[] stringArray) {
        //for each loop
        StringBuilder output = new StringBuilder("[");
        int counter = 0;
        for (String s : stringArray) {

            if (s == null){
                s = "null";
            }
            output.append(s);

            counter++;

            if (counter != stringArray.length){
                output.append(", ");
            }else {
                output.append("]");
            }
        }

        System.out.println(output);
    }

    //enter list of your fav fruits text separated by comma
    //apple,banana,cucumber,moringa
    //String.split(",")
    //return array

    private static String[] getFavouriteFruits(String[] fruits) {
        String[] myFruitChoice = new String[MY_FAVOURITE_FRUITS_SIZE];
        int position = 0;

        for (int i = 0; i < fruits.length; i++) {
            if (i % 2 == 1 && position < MY_FAVOURITE_FRUITS_SIZE) {
                myFruitChoice[position] = fruits[i];
                position++;
            }
        }
        return myFruitChoice;
    }

    private static String[] getArrayOfFruits() {
        return new String[]{"Banana", "Mango", "Apple", "Orange", "Cucumber", "Water mellon"};
    }

}
