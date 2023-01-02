package com.tutorial.java.fundamentals.classexample;

import java.util.ArrayList;

public class ChangeGiver {

    //a method that can give a customer change given currency of 5, 10, 20, 50, 100, 200, 500 1000
    //method should take amount as argument

    ArrayList<Integer> giveChange(int balance) {
        //loop through the currency
        //check if balance / currency is greater than or equal to 1
        //if true, divide balance by currency value
        //the result will determine how many currency to give
        //subtract currency * result from balance, answer is now the new balance
        //continue looping

        ArrayList<Integer> changeList = new ArrayList<>(); //dont disturb yourself for now

        int tempBalance = balance;  //1500
        int [] currency = {1000, 500, 200, 100, 50, 20, 10, 5};

        for (int i = 0; i < currency.length; i++) {
            int currentCurrency = currency[i]; //1000
            int currencyCount = tempBalance / currentCurrency; //1
            if (currencyCount >= 1){ //yes
                for (int j = 0; j < currencyCount; j++) {
                    changeList.add(currentCurrency);
//                    tempBalance = tempBalance - currentCurrency;
                }
                tempBalance = tempBalance - (currentCurrency * currencyCount);
            }
        }
        return changeList;
    }

    public static void main(String[] args) {
        System.out.println(new ChangeGiver().giveChange(5485));
    }
}
