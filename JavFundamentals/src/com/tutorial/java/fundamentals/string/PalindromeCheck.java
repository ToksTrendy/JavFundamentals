package com.tutorial.java.fundamentals.string;

public class PalindromeCheck {
    public boolean isPalindrome(String string) {
//        is a string that reads the same backwards as forwards
//        e.g madam nursesrun
        char[] chars = string.toCharArray(); //{'m', 'a', 'd', 'a', 'm'}
        int length = string.length();

        for (int i = 0; i < length / 2; i++) {
//            char aChar = chars[i];
//            if (aChar != chars[length-1 - i]) {

            if (chars[i] != chars[length-1 - i]) {
                return false;
            }
        }  //end of loop
        return true;
    }

    public static void main(String[] args) {
        boolean isPalindrome = new PalindromeCheck().isPalindrome("nuteteooooooon");
        int count;
        if (isPalindrome) {
            System.out.println("Is a palindrome");
            count = 1;
        }else {
            System.out.println("Is not a palindrome");
            count = 0;
        }

        String text  = isPalindrome ? "Is a palindrome" : "Is not a palindrome";
        count  = isPalindrome ? 1 : 0;

        System.out.println(count);
        System.out.println(text);


        // statement ? success value : failure value
    }
}
