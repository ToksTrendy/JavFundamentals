package com.tutorial.java.fundamentals.classwork;

public class RemoveStringChallenge {

    public static void main(String[] args) {
        new RemoveStringChallenge().remove("Assignment", "A");
        new RemoveStringChallenge().remove("classwork", "class");
        new RemoveStringChallenge().remove("Hardwork at workplace", "work");
    }

    public String remove(String originalString, String toBeRemoved) {
        String replacedString = originalString.replaceAll(toBeRemoved, "");
        System.out.println(replacedString);
        return replacedString;
    }

}
